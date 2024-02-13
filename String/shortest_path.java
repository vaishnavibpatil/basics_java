public class shortest_path 
{
    public static int short_path(String path)
    {
        int x=0;
        int y=0;
        for(int i=0; i<path.length() ; i++)
        {
            char c = path.charAt(i);
            if(c =='W')
            {
                --x;
            }
            else if(c == 'E')
            {
                ++x;
            }
            else if(c =='N')
            {
                ++y;
            }
            else
            {
                --y;
            }
        }
        System.out.println("co ordinates" + "(" +x +"," +y +")");
            int x2 = x*x;
            int y2 = y*y;
            int p = (int)Math.sqrt(x2 + y2);
            return p;

       
    }
    public static void main(String[] args)
    {
          String path ;
          path = "WNEENESENNN" ;
          System.out.print("shortest path :-"+short_path(path));
    }
    
}
