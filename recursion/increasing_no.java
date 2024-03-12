 public class increasing_no
 {
   public static void main(String[] args)
   {
    int n=10;
    numbers(n);
   } 
 
 public static void numbers(int n)
 {
    if(n==1)
    {
        System.out.println(n);
        return;
    }
    System.out.println(n+ " ");
    numbers(n-1);


 }
}