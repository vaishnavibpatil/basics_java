public class subarray

{
    public static void pairs(int num[])
    {
        int max_sum=Integer.MIN_VALUE;
        
        
        for(int i=0;i<num.length;i++)
        {
            int start=i;
            
                for (int j=i;j<num.length;j++)

                {
                    int sum=0;
                    int end=j;
                    for(int k=start;k<end;k++)
                    {
                        System.out.print(num[k] + " ");
                       
                        sum=sum+num[k];
                    }
                   // System.out.print("    sum=" +sum);
                    if(sum>max_sum)
                    {
                        max_sum=sum;
                    }
                    System.out.println();
                }
                System.out.println();
            
        }
        System.out.print("max_sum" + max_sum);
    }


    public static void main(String args[]) 
    {
    int num[]={1,2,3,4,5,6,7};
    pairs(num);
    }
}

