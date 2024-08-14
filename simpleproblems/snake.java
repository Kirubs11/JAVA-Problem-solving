/* 

Marks : 20

Negative Marks : 0

SNAKE PATTERN




Problem Statement:

Print matrix in snake pattern

Input Format:

Number of elements followed by 2D array as input elements

Output Format:

Print Snake pattern

Constraints:

NA

Sample Input :

3 3
1 2 3
4 5 6
7 8 9

Sample Output :

1 2 3
6 5 4
7 8 9  */

import java.util.*;
class snake
{
  public static void main(String args[])
  {
    Scanner ob=new Scanner(System.in);
    int r=ob.nextInt();
    int c=ob.nextInt();
    int[][] a=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        a[i][j]=ob.nextInt();
      }
    }
    for(int i=0;i<r;i++)
    {
      if(i%2==0)
      {
        for(int j=0;j<c;j++)
        {
          System.out.print(a[i][j]+" ");
        }System.out.println();
      }
      else
      {
        for(int j=c-1;j>=0;j--)
        {
          System.out.print(a[i][j]+" ");
        }
        System.out.println();
      }
    }
  }
}