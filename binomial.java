import java.util.*;
public class binomial 
{
    public static int factorial(int n)
    {
        int factorial=1;
        for(int i=1;i<=n;i++)
        {
            factorial=factorial*i;
           
        }
        return factorial;
         
    }
    public static int  binomial_coe(int n,int r)
    {
        int n_fact=factorial( n);
        int r_fact=factorial( r);
        int fact=factorial(n-r);
        int coefficient=n_fact/(r_fact * fact);
        return coefficient;

    }
    public static void main(String args[])
    {
        
        int vish = binomial_coe(5,3);
        System.out.println(vish);
    }
}
