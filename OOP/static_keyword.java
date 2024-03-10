public class static_keyword 
{
   public static void main(String[] args)
   {
    student s1 = new student();
    s1.setname("pooja");
    s1.getname();
    s1.school_name="PMV";

    student s2 = new student();
    s2.school_name="bgm";

    System.out.println(s1.school_name);
     
   } 
}
class student
{
    String name;
    int roll;
    static String school_name;

    void setname(String name)
    {
        this.name = name;
    }
    String getname()
    {
        return this.name;
    }
}

