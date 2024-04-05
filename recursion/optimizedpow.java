public class optimizedpow 
{
    public static void main(String[] args)
    {
        System.out.print(opt(2,5));
    }
    public static int opt(int x,int n)
    {
        if(n == 0)
        {
            return 1;
        }
        int pow_sq = opt(x,n/2) * opt(x,n/2);

        if(n % 2 !=0)
        {
            pow_sq = x * pow_sq;
            return pow_sq;
        }
        return pow_sq;
    }
    
}
