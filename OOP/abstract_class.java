public class abstract_class 
{
    public static void main(String[] args) 
    {  //cannot create instance of abstract class 
        //animal a = new animal();
        horse h1 = new horse();
        h1.eat();
        h1.walk();
        System.out.println(h1.color);

        chicken c1= new chicken();
        c1.eat();
        c1.walk();

        fins f1= new fins();  
        //constructors sequentially called
        //super class animal
        //parent class chicken
        //child class fins
        
    }
    
}
abstract class animal
{
    String color;
    animal()
    {
        color="brown";
        System.out.println("constructor of animal is called....");
    }
    void eat()
    {
        System.out.println("animal eat");
    }
    abstract void walk();

}
class horse extends animal

{ 
    horse()
    {
        System.out.println("constructor of horse is called....");

    }
    void changecolor()
    {
        color="darkbrown";
    }
    void walk()
    {
        System.out.println("horse walks on 4 legs");
    }
}
class chicken extends animal
{
    chicken()
    {
        System.out.println("constructor of chicken is called....");

    }
    void changecolor()
    {
        color="white";
    }
    void walk()
    {
        System.out.println("walk on 2 legs");
    }
}
class fins extends chicken
{
    fins()
    {
        System.out.println("constructor of fins is called....");
    }
}