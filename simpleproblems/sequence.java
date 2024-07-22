/*Given a set of elements, you need to pick all even
elements from the given array. as per the input sequence .*/

import java.util.*;
class sequence{
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    int n=ob.nextInt();
    int[] arr=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=ob.nextInt();
    }
    for(int j=0;j<n;j++)
    {
      if(arr[j]%2==0)
      {System.out.print(arr[j] + " ");}
    }
  }
}