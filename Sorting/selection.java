import java.io.*;
public class selection
{
    public static void selectionsort(int num[])
    {
        for(int i=0;i<=num.length-2;i++)
        {
            int min_pos=i;
            for(int j=i+1;j<num.length;j++)
            {
                if(num[min_pos] > num[j])
                 {
                    min_pos=j;
                 }
            }
             int temp =num[min_pos];            
             num[min_pos]=num[i];
             num[i]=temp;
        }
       
    }
    public static void print(int num[])
    {
         for(int i=0; i<num.length; i++)
         {
            System.out.print(num[i] +" ");
         }
    }
    public static void main(String[] args) 
{
         int num[]={5,4,1,3,2};
         selectionsort(num);
         print(num);

}
}
