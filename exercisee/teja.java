import java.util.*;
public class teja
{
    public static void birth(int birth_date)
    {
        if(birth_date == 422025)
        {
            System.out.println("On this day teja's birth day");
        }
        else
        {
            System.out.println("nothing-------Enjoy your dayyyy");

        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int birth_date=sc.nextInt();
        birth(birth_date);
    }
}