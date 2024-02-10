import java.util.*;
public class palindrome
{
    public static boolean ispalindrome(String str)
    {
        int n=str.length();
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i) != str.charAt(n-1-i))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str ;
        str = sc.nextLine();
        System.out.print(ispalindrome(str));
    }
}