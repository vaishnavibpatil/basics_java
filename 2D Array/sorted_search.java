public class sorted_search 
{
    public static boolean sorted(int arr[][],int key)
    {
    int row=0, col=arr.length-1;
    while(row < arr.length && col >=0)
    {
         if(arr[row][col]==key)
         {
            System.out.print("found at "+"("+row+","+col +")");
            return true; 
        }
         else if (key < arr[row][col]) 
         {
            col--;
         }
         else
         {
            row++;
         }
    }
    System.out.println("not found");
    return false;
    }
    public static void main(String[] args)
    {
        int arr[][]={{1,2,3},
         {4,5,6}, 
         {7,8,9}}; 
         int key=6;
         System.out.println(sorted(arr,key));
    }
    
}
