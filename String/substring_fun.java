public class substring_fun
{
    public static String sub(String str,int Si,int Ei)
    {
        String substr = " ";
    
        for(int i=Si;i<Ei;i++)
        {
           substr=substr + str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[])
    {
        String str = "Helloworld";
        //System.out.print(sub(str,2,6));

        //othewise use substring function
        System.out.println(str.substring(2,5));

    }
    

}



