public class getter_set 
{
  public static void main(String[] args)
  {
    Pen p1 = new Pen(); //object
    p1.setcolor("pink");
    System.out.println(p1.getcolor());

    p1.settip(5);
    System.out.println(p1.gettip());
    p1.setcolor("yellow");
    System.out.println(p1.getcolor());

  }
    
}
class Pen
{
    //prop + function
    private String color;
    private int tip;

    void setcolor(String newcolor)
    {
        color = newcolor;
    }
    void settip(int newtip)
    {
        tip=newtip;
    }
    String getcolor()
    {
        return color;
    }
    int gettip()
    {
        return tip;
    }


}

