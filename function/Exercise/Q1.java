
import java.util.*;
public class Q1
{
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        System.out.print("average : " + av(a,b,c));

    }
    public static int av(int a,int b,int c)
    {    
        return (a+b+c)/3;
    }
}