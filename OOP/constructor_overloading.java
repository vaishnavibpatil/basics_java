public class constructor_overloading 
{
    public static void main(String[] args)
    {
         student s1 = new student(); 
         student s2 = new student("vaishu"); 
         student s3 = new student(57);        
    }   
}
class student 
{
    String name;
    int roll;
    student()
    {
       System.out.println("constructor is called....");
    }
    student(String name)
    {
       this.name = name;
       System.out.println(name);
    }
    student(int roll)
    {
       this.roll = roll;
       System.out.println(roll);
    }
}


    

