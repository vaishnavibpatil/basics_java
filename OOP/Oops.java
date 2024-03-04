public class Oops
{
  public static void main(String[] args)
  {
    Pen p1 = new Pen(); //object
    p1.setcolor("pink");
    System.out.println(p1.color);

    p1.settip(5);
    System.out.println(p1.tip);
    p1.color ="yellow";
    System.out.println(p1.color);

  }
    
}
class Pen
{
    //prop + function
    String color;
    int tip;

    void setcolor(String newcolor)
    {
        color = newcolor;
    }
    void settip(int newtip)
    {
        tip=newtip;
    }

}

class Student
{
    String name;
    int age;
    float percentage;

    void calculatepercentage(int phy,int chem,int bio)
    {
        percentage = phy+chem+bio/3;
    }
}