import java.util.*;
class zigzag implements Runnable
{
  int[][] matrix;
  int row;
  int col;
  int sum = 0;
 
  public zigzag(int[][] matrix, int row, int col)
  {
    this.matrix = matrix;
    this.row = row;
    this.col = col;
  }
  public void run()
  {
    for (int j=0;j<col; j++)
    {
     sum += matrix[0][j];
    }
    for (int i=1;i<row-1;i++)
    {
     sum += matrix[i][col-i-1];
    }
    for (int j=0;j<col;j++)
    {
     sum += matrix[row-1][j];
    }
  }
   public int getSum()
   {
    return sum;
   }
   public static void main(String[] args)
   {
    Scanner ob = new Scanner(System.in);
    int row = ob.nextInt();
    int col = ob.nextInt();
    int[][] matrix = new int[row][col];
    for (int i = 0; i < row; i++)
    {
     for (int j = 0; j < col; j++)
     {
      matrix[i][j] = ob.nextInt();
     }
    }
    zigzag z = new zigzag(matrix, row, col);
    Thread t1 = new Thread(z);
    t1.start();
    try
    {    
     t1.join();
    }
    catch (InterruptedException e)
    {
     e.printStackTrace();
    }
    System.out.println("The sum of Zig-Zag pattern is :" + z.getSum());
  }
}