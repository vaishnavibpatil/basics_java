public class super_keyword 
{
    public static void main(String[] args)
    {
       horse h =new horse();
       System.out.println(h.color);
    } 
}
class animal
{
    String color;
    animal()
    {
        System.out.println("cnstructor animal is calling...");
    }
}
class horse extends animal
{    
    horse ()
    {
        super();
        super.color="brown";
        System.out.println("cnstructor horse is calling...");
    }
   

}
