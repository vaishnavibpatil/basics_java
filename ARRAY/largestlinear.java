import  java.util.*;
public class largestlinear 
{
    public static int  largest(int num[])
    {
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++)
        {
            if(largest < num[i])
            {
                largest=num[i];
            }
            
        }
        return largest;
    }
    public static void main(String args[])
{
    int num[]={10,20,90,30,45,2,34};
    int large=largest(num);
    System.out.print("largest no from array : " +large);;

}
}

    

