
import java.util.*;
public class Q1 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        if(n<0)
        {
            System.out.println("negative number");


        }
        else if(n==0)
        {
            System.out.println("0 is neither positive nor negative");
        }
        else{
            System.out.println("positive number");
        }
    }

    
}
