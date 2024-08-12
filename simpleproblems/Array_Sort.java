// Given a list of elements , arrange the elements in ascending order.

import java.util.*;
class Array_Sort
{
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    int n=ob.nextInt();
    long[] arr=new long[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=ob.nextLong();
    }
    Arrays.sort(arr);
    for(int i=0;i<n;i++)
    {
      System.out.print(arr[i] + " ");
    }
  }
}
