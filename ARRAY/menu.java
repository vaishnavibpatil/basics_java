public class menu {
    public static  int linear(String num[],String key)
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
        String num[]={"dosa","samosa","idali","vadapao","vada"};
        String key="dosa";
        
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

