public class tilling_problem
{
    public static int prob(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        //vertical choice
        int fnm1 =  prob(n-1);

        //horizontal choice
        int fnm2 =  prob(n-2);

        return fnm1 + fnm2;
    }
    public static void main(String[] args)
    {
        System.out.print(prob(4));
    }
}
