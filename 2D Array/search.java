import java.util.*;
public class search
{
    public static boolean search(int matrix[][],int key)
    {
        int n=matrix.length,m=matrix[0].length;
        for(int i=0;i<n;i++)
            {
             for(int j=0;j<m;j++)
             {
                if(key == matrix[i][j])
                {
                    System.out.print("found at (" +i+","+j+")" );
                    return true;
                }
             }
            }
            System.out.print("not found");
            return false;
           
    }
    
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        int n=matrix.length,m=matrix[0].length;
        
        
            for(int i=0;i<n;i++)
            {
             for(int j=0;j<m;j++)
             {
                 matrix[i][j] =sc.nextInt();
             }
            }
            //output
            for(int i=0;i<n;i++)
            {
             for(int j=0;j<m;j++)
             {
                 System.out.print(matrix[i][j] +" "); 
             }
             System.out.println();
            }
            
            System.out.print(search(matrix,12));

         
    }
}