
public class prime 
{
    public static boolean primee(int n)
    {
        if(n==2)
        {
            return true;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println(primee(2));
    }
    
}
