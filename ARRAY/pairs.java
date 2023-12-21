import java.util.*;

public class pairs
{
    public static void pairs(int num[])
    {
        int tp=0;
        for (int i = 0; i < num.length; i++)
        {
        int current= num[i];
        for (int j = i+1; j < num.length; j++)
        {
            System.out.print("(" + current + ","+num[j]+")");
            tp++;
        }
        System.out.println();
    }
    System.out.println("total pairs : " +tp);
        
    }
    public static void main(String[] args)
    {
        int num[]={1,2,3,4,5,6,7};
        pairs(num);
    
    }
    
}
