import java.util.*;
public class leap_year 
{
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
    int year = sc.nextInt();
    boolean a=(year % 4 ==0) ;
    boolean b=(year % 100 != 0); 
    boolean c=((year % 400 ==0) && (year % 100 ==0 ) );

    if(a && (b || c))
    {
        System.out.println("leap year");

    }
   else
        {
           System.out.println("not leap year"); 
        }
    }


    
}
