public class Findsubset 
{
    public static void fsubset(String str,String ans,int i)
    {
        if(i == str.length())
        {
            if(ans.length() == 0)
            {
                System.out.println("null");
            }
            else
            {
                System.out.println(ans);
            }
            return;
        }
        //yes choice
        fsubset(str,ans + str.charAt(i),i+1);

        //no choice
        fsubset(str,ans,i+1);
        
    }
    public static void main(String[] args)
    {
        String str ="abc";
        fsubset(str," ",0);
    }
    
}
