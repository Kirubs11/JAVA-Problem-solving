import java.util.*;
class Matrix_find{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the row size: ");
        int c=ob.nextInt();
        System.out.println("Enter the coloumn size: ");
        int r=ob.nextInt();
        int flag=0;
        int[][] ar=new int [c][r];
        for(int i=0; i<c; i++)
        {
            for(int j=0; j<r; j++)
            {
                ar[i][j]=ob.nextInt();
            }

        }
        System.out.println("Enter the target to find : ");
        int target=ob.nextInt();
        for(int i=0; i<c; i++)
        {
            for(int j=0; j<r; j++)
            {
                if(ar[i][j]==target)
                {
                    System.out.println("Element found at position: ("+i+","+j+")");
                    flag=1;
                }
            }
        }
        if(flag==0) System.out.print("-1");
    
    }
}