import java.util.*;
public class BINARY_search 
{
    public static  int binary(int num[],int key)
    {
        int start=0;
        int end=num.length-1;
       
        while(start<=end)
        {
           int mid=(start+end)/2;
            if(num[mid]==key)
            {
                return mid;
            }
            if(num[mid] < key)
            {
                start=mid+1;  
            }
            else
            {
                end=mid-1;
            }
        }
        return -1;
      

    }
    public static void main(String args[])
    {
        int num[]={12,23,45,67,89,90,99};
        int key=100;
        
        System.out.println(binary(num,key));


    }
}
