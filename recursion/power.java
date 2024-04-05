public class power 
{
    public static void main(String[] args)
    {
        System.out.println(pow(2,5));
    }
    public static int pow(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        // int xnm1 = pow(x,n-1);
        // int xn = x * xnm1;
        // return xn;
        return x * pow(x,n-1);
    }
    
}
