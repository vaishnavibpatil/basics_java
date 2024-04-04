public class decreasing
{    public static void main(String[] args)
    {
       inc(10);
    }
    public static void inc(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return ;
        }
        System.out.println(n);
        inc(n-1);
       
    }
    
}
