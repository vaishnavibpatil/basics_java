import java.util.Scanner;

public class reverse_forloop 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int len = (int) (Math.log10(n) + 1);
        for(int i=0;i<len;i++)
        {
            int l=n%10;
            n=n/10;

            System.out.print(l);
        }
    }
    
}
