
import java.util.*;
public class Swap
{
    public static void Swap(int a, int b)
    {
    int temp;
    temp=a;
    a=b;
    b=temp;
   

    }
   public static void main(String[] args)

{
    int a=10;
    int b=5;
    Swap(a,b);
     System.out.println("a:" +a);
    System.out.println("b :" +b);
    


}
}