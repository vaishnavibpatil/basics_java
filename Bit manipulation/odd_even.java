public class odd_even 
{
    public static void oddoreven(int n)
    {
        int bitMask = 1;
        if((n & bitMask) == 0)
        {
            System.out.println("no is even");
        }
        else
        {
            System.out.println("no is odd");
        }
    }
    public static void main(String[] args)
    {
        oddoreven(11);
    }
}
