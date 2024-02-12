import java.util.*;
public class weeks_and_days 
{
    public static void weeks(int n)
    {
        int  week ;
        int days;
        if(n < 7 && n > 0)
        {
            System.out.print(n +" days");
        }
        
        else 
        {
            week = n / 7;
            days = n % 7;
            System.out.print(week +" week and "+days+" days");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        weeks(n);

    } 
    
}
