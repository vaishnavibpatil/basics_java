import java .util.*;
public class addition
{
    public static int calculate(int x, int y)
    {
        int sum=x+y;
        return sum;
    }
public static void main(String arg[])
{
      Scanner sc=new  Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();     
      calculate(a,b);
      System.out.println("sum is :" + sum); 
                                   

}
}