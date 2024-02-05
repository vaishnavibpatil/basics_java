public class subarray_sum
{
    public static void sub(int arr[])
    {
        int max=Integer.MIN_VALUE;;
        
         for(int i=0; i<arr.length; i++)
         
         {
            
            for(int j=0; j<arr.length; j++)
            {
                int sum=0;
                
                for(int k=i; k<=j; k++)
                {
                   
                    System.out.print(arr[k] +" ");
                    sum=sum+arr[k];
                }
                if(sum>max)
                {
                    max=sum;
                }
                System.out.println();

            }
            System.out.print("Max: " + max);
         }
         
    
        

    }
    public static void main(String[] args)
    {
        int arr[]={11,12,13};
        sub(arr);
    }
}