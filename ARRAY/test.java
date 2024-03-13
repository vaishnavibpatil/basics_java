public class test {
    public static void main(String args[])
    {
    int nums[]={3,2,4};
    int  target = 6;
    twoSum(nums,target);
}
    public static void twoSum(int nums[], int target) 
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
               if(nums[i]+nums[j]==6)
               {
                System.out.print("["+ i +","+ j +"]");
               }
            }
        }
    }
}
