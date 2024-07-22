// For a given value you need to print the K nearest elements for given set of elements.

import java.util.Arrays;
import java.util.Scanner;
class kth_nearest{
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    int n=ob.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=ob.nextInt();
    }
    int k=ob.nextInt();
    int value=ob.nextInt();
    Arrays.sort(arr);
    int index=Arrays.binarySearch(arr,value);
    if(index<0) {index=-index-1;}
    int left=index-1;
    int right=index;
    for(int i=0;i<k;i++)
    {
      if(left>=0 && (right>=n || Math.abs(arr[left]-value)<=Math.abs(arr[right]-value)))
      {
        System.out.print(arr[left]);
        left--;}
      else 
      {
        System.out.print(arr[right]);
        right++;}
      if(i<k-1)
      {System.out.print("");}
    }
  }
}