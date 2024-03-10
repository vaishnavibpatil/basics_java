class interface_multiple 
{
    public static void main(String[] args) 
    {
          queen  q=  new queen();
          q.moves();
          rook r = new rook();
          r.moves();
    }
    
}
interface chess
{
    void moves();
} 
class queen implements chess
{
  public void moves()
{
    System.out.println("left,right,top,bottom,diagonally(in all directions");
}
}
class rook implements chess
{
  public void moves()
{
    System.out.println("left,right,top,bottom");
}
}