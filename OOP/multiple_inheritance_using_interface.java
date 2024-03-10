public class multiple_inheritance_using_interface 
{
   public static void main(String[] args)
    {
        beer b = new beer();
        b.eat();
        b.run();
    }  
}
interface harbivorous
{
    void eat();
}
interface carnivorous
{
    void run();
}
class beer implements harbivorous,carnivorous 
{
    public void eat()
    {
        System.out.println("eats both");
    }
    public void run()
    {
        System.out.println("run fast");
    }

}
