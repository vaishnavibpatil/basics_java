import java.util.*;
public class Q2 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        iseven(n);
    }
    public static void iseven(int n)
    {
        
        
        if(n%2==0)
        {
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    
}
