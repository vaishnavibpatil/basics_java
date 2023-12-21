import java.util.*;
public class Exercise_2 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int sum_even=0;
        int sum_odd=0;
        System.out.print("how many no you want to enter?");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            int num=sc.nextInt();

            if(num%2==0)
            {
                sum_even=sum_even + num;
            }
            else
            {
                sum_odd=sum_odd + num;

            }

        }
        System.out.println("sum of even no :-" + sum_even);
        System.out.println("sum of odd no :-" + sum_odd);

    }
    
}
