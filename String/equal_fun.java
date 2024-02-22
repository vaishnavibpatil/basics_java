public class equal_fun
{
    public static void main(String[] args)
    {
        String str1="tony";
        String str2="tony";
        String str3= new String("tony");

        if(str1==str2)
        {
            System.out.println("strings are equal");
        }
        else
        {
            System.out.println("strings are not equal");
        }

        //here not equal is print because by using new keyword new memory is allocate thats why we use equal function
        if(str1==str3)
        {
            System.out.println("strings are equal");
        }
        else
        {
            System.out.println("strings are not equal");
        }

        // equal function
        if(str2.equals(str3))
        {
            System.out.println("strings are equal");
        }
        else
        {
            System.out.println("strings are not equal");
        }

    }
    
}
