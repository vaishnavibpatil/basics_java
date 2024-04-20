public class search_rotated_sorted_array_iterator 
{
    public static int search(int arr[],int si,int ei,int tar)
    {
        while(si <= ei)
        {
            int mid = si +(ei-si)/2;
            if(tar == arr[mid])
            {
                return mid;
            }
            if(arr[mid] >= arr[si])
            {
                if(arr[si]<= tar && tar <= arr[mid])
                {
                    ei = mid-1;
                }
                else
                {
                    si = mid+1;
                }
            }
            else
            {
                if(arr[mid] <= tar && tar <= arr[ei])
                {
                    si = mid+1;   
                }
                else
                {
                    ei= mid-1;
                }
            }
        }
        return -1;
        
        
    }
    public static void main(String[] args)
    {
        int arr[] = {4,5,6,7,0,1,2};
        int tar =0;
        int idx =search(arr, 0, arr.length-1,tar);
        System.out.print(idx);
    }
    
}
