public class linear_search 
{
    public static  int linear(int num[],int key)
    {
        for(int i=0;i<num.length;i++)
        {
            if(num[i]==key)
            {
                return i;

            }

        }
        return -1;
    }
    public static void main(String args[])
    {
        int num[]={12,23,45,67,89,78};
        int key=89;
        
        int index=linear(num,key);
        if(index==-1)
        {
            System.out.println("not found");
        }
        else
        {
            System.out.println("index :"  +index);
        }

    }
    
}
