public class fun_overloading_parameter
{

    public static int sum(int a,int b)
    {
        return a+b;
    }
    
    public static int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    public static void main(String[] args)
    {
        int add=sum(8,9);
        int add3=sum(5,8,7);
        System.out.println(add);
        System.out.println(add3);

    }
    
}
