import java.util.*;
public class decimal_to_binary
{
    public static void bin_dec(int bin_no)
    {
        int pow=0;
        int dec=0;
        int mynum=bin_no;;
        
        while(bin_no >0)
        {
             int LD=bin_no%10;
             dec=dec +(LD * (int)Math.pow(2,pow));


             pow++;
             bin_no=bin_no/10;
        }
          System.out.println("deecimal of  " +mynum + "  dec" +dec);

    }
    public static void main(String[] args) 
    {
        bin_dec(1000);
    }
    
}
