public class diago_sum_optimize
{
    public static int diagonal(int arr[][])
    {
       int sum=0;
       for(int i=0;i<arr.length;i++)
       {
          sum=sum + arr[i][i];
          if(i != arr.length-1-i)
          {
          sum=sum+arr[i][arr.length-1-i];
          }
       }
       return sum;
    }
    public static void main(String[] args)
    {
        int arr[][] = {{1,2,3},
                   {4,5,6},
                   {7,8,9}};
        System.out.print(diagonal(arr));
        
    }
    
}
