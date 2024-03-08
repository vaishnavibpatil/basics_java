public class method_overriding 
{
    public static void main(String[] args)
    {
       dog d1 = new dog();
       d1.eat();

    }
    
}
class animal
{
    void eat()
    {
        System.out.println("eating");
    }
}
class dog
{
    void eat()
    {
        System.out.println("eatinggggg");
    }
    void breed()
    {
        System.out.println(" breeds");
    }
}

