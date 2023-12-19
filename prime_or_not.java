import java.util.*;
// public class prime_or_not
// {
//     public static boolean isprime(int n)
//     {
        
//          if(n==1)
//         {
//             return false;
//         }
       
//         for (int i = 2; i < n; i++)
//         {
//             if(n%i==0)
//             {
//                 return false;
//             }
           
//         }
//         return true;
        
        
      
//     }
//     public static void main(String[] args)
//     {
//         System.out.print(isprime(1));
//     }
    
// }


//  

public class prime_or_not 
{
    public static boolean isprime(int n)
    {
         
        if(n==2)
        {
            return true;
        }
         for(int i=2;i<=Math.sqrt(n);i++)
         {
            if(n%i==0)
            {
                return  false;
            }
         }
         return true;
    }

     public static void main(String[] args)
     {
        System.out.println(isprime(7  ));
     }
}