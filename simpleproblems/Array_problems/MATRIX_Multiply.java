import java.util.*;
class MATRIX_Multiply{
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    int r=ob.nextInt();
    int c=ob.nextInt();
    int[][] ar=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        ar[i][j]=ob.nextInt();
      }
    }
    int[][] ar1=new int[r][c];
    for(int i=0;i<c;i++)
    {
      for(int j=0;j<r;j++)
      {
        ar1[i][j]=ar[j][i];
      }
    }
    int[][] res=new int[r][c];
    for(int k=0;k<c;k++)
    {
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
        {
          res[i][k]+=ar[k][j]*ar1[j][i];
        }
      }
    }
    System.out.println("Result:");
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        System.out.print(res[i][j]+" ");
      }
      System.out.println();
    }
  }
}
