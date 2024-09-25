import java.util.*;
class max_ele_in_array
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        
        int[][] ar=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                ar[i][j]=ob.nextInt();
            }
        }
        int max=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(max<ar[i][j])
                {
                    max=ar[i][j];
                }
            }
            System.out.print(max+" ");
        }
    }
}