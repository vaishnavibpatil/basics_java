import java.util.*;
public class palidrome 
{
    public  static int reverse(int n)
    {
        
        int r=0;
        while(n>0)
        {
            int LD=n%10;
            n=n/10;
            r= (r*10) + LD ;         
        }
        return r;      
    }
        
public static void palidrome(int n,int r)
    {
        if(n==r)
        {
            System.out.println("Number is palindrome");
        }
        else
        {
            System.out.println("Number is not palindrome");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();      
        int rev = reverse(n);
        palidrome(n,rev);
        
    }
    
}
