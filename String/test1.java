public class test1
{
    public static void main(String args[])
    {
        String arr[] = {"abc","def","ghi"};
        System.out.println(hello(arr));
    }
         

public static String hello(String arr[])
{
String s="";  
for(int i=0;i<arr.length;i++)
{
    String str =arr[i];
    char min='z';
    for(int j=0;j<str.length();j++)
    {
        
        if(str.charAt(j) < min)
        {
           min=str.charAt(j);                 
        }      
    }   
     s=s+min;    
}
return s;
}
}
