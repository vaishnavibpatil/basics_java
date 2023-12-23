import java.io;
public class bubble
{
    public static void bubble_sort(int num[])
    {
        for(int turn=0;turn<=num.length-2;turn++)
        {
            for(int j=0;j<=num.length-2-turn;j++)
            {
                if(num[j]>num[j+1])
                {
                    int temp=num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }

            }
        }

    }
    public static void print(int num[])
    {
        for(int i=0; i<num.length; i++)
        {
            System.out.println(num[i] +" ");
        }
        System.out.println();
    }

    public static void main(String args[])

    {
        int num[]={5,4,1,3,2};
        bubble_sort(num);
        print(num);
    }
}