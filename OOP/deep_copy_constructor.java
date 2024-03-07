public class deep_copy_constructor
{
    public static void main(String[] args)
    {
        student s1 = new student();
        s1.name ="vaishu";
        s1.roll=45;
        s1.marks[0]=100;
        s1.marks[1]=56;
        s1.marks[2]=23;
        System.out.println(s1.marks[2]);
        student s2 = new student(s1);

        System.out.println(s2.marks[2]);

        s1.marks[2]=90;   
        s1.name ="rutuja";
        System.out.println(s2.name);

        for(int i=0 ; i< 3;i++)
        {
            System.out.println(s2.marks[i]);
        }
    }
}
    
    class student
{
    int roll;
    String name;
    int marks[] = new int[3];;

    student()
    {
        System.out.println("consructor calling");
    }
    student(student s1)
    {    
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i< 3;i++)
        {
            this.marks[i] =s1.marks[i];//copy first array values makes new array and copy values from s1
        }
        
    }
}

