public class sum_of_first_n_no 
{
    public static void main(String[] args)
    {
        int n=5;
        System.out.print(sum_n(n));
    }
    public static int sum_n(int n)
    {
       if(n==1)
       {
         return 1;
       }
       int sum = n + sum_n(n-1);
       return sum;
    }


}
