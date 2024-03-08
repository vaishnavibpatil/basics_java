 class method_overloading 
{
    public static void main(String[] args)
    {
        calculator c1 = new calculator();
        System.out.println(c1.sum(3,4));
        System.out.println(c1.sum((float)3.2,(float)4.8));
        System.out.println(c1.sum(3,4,6));
    }
}
class calculator
{
    int sum(int a, int b)
    {
        return a+b;
    }
    float sum(float a, float b)
    {
        return a+b;
    }
    int sum(int a, int b,int c)
    {
        return a+b+c;
    }
}
