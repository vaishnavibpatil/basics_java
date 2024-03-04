public class constructor 
{
    public static void main(String[] args)
    {
         student s1 = new student();
         
    }
    
}
class student 
{
    String name;
    int roll;
    student()
    {
       System.out.print("constructor is called....");
    }
}
/*{
    public static void main(String[] args)
    {
         student s1 = new student("vaishu");
         System.out.print(s1.name);
    }
    
}
class student 
{
    String name;
    int roll;
    student(String name)
    {
       this.name = name;
    }
}*/

