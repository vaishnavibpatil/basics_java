public class first_occurence 
{
    public static void main(String[] args)
    {
        int arr[]={2,4,6,5,6};
        System.out.print(occ(arr,6,0));
    }
    public static int occ(int arr[],int key,int i)
    {
        if(i == arr.length-1)
        {
            return -1;
        }
        if(arr [i] ==key)
        {
            return i;
        }
        return occ(arr,key,i+1);
    }
    
}
