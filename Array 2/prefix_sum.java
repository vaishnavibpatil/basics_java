public class prefix_sum
{
    public static void prefix(int arr[])
    {
        int sum=0;
        int max=Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for(int i=1;i<arr.length;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++)
        {
           System.out.print(prefix[i] + " ");
        }
        System.out.println();
        for(int i=0;i<arr.length;i++)
        {
            int start=i;
            for(int j=0;j<arr.length;j++)
            {
                int end=j;
                sum=start==0 ? prefix[end] : prefix[end]- prefix[start - 1];
            }
            if(max < sum)
            {
                max=sum;
            }
        }
        System.out.print("Max_sum=" + max);
    }
    public static void main(String[] args)
    {
        int arr[]= {1,-2,6,-1,3} ;
        prefix(arr);
    }
}