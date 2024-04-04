public class last_occurence 
{
 public static void main(String[] args)
 {
    int arr[]={1,2,3,4,5,4,6};
    System.out.print(occ(arr,4,0));
 }
 public static int occ(int arr[], int key, int i)
 {
    if(i == arr.length) 
    {
        return -1;
    }
    int isfound = occ(arr, key, i+1);
   
    if(isfound == -1 && arr[i]==key)
    {    
        return i;      
    }
    return isfound;
 }
    
}
