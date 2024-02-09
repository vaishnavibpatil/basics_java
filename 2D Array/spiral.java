public class spiral 
{
    public static void printspiral(int matrix[][])
    {
        int SR=0;
        int ER=matrix.length-1;
        int SC=0;
        int EC=matrix[0].length-1;

        while(SR <= ER && SC <= EC)
        {
            for(int j=SC;j<=EC;j++)
            {
                System.out.print(matrix[SR][j]+" ");
            }
            for(int i=SR+1;i<=ER;i++)
            {
                System.out.print(matrix[i][EC]+" ");
            }
            for(int j=EC-1;j>=SC;j--)
            {
                
                if(SR == ER)
                {
                    break;
                }
                System.out.print(matrix[ER][j]+" ");
            }
            for(int i=ER-1;i>=ER+1;i--)
            {
                
                if(SC == EC)
                {
                    break;
                }
                System.out.print(matrix[i][SC]+" ");
            }
            SR++;
            ER--;
            SC++;
            EC--;

        }
    }
    public static void main(String[] args)
    {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        printspiral(matrix);
                    
    }
    
}
