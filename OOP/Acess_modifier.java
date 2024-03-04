public class Acess_modifier 
{
    public static void main(String[] args)
    {
         bankaccount b1 = new bankaccount();
         b1.username = "vaishnavi";
         //error b1.password  = "abcdef"; we cnnot access password here
         b1.setpassword("abcdef");
    }
    
}
 class bankaccount
 {
    public String username;
    private String password;
    public void setpassword(String pwd)
    {
        password = pwd;
    }
 }
