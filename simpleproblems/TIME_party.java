/* A party has been organised on cruise. The party is organised for a limited time(T). The number of guests entering (E[i]) and leaving (L[i]) the party at every hour is represented as elements of the array.The task is to find the maximum number of guests present on the cruise at any given instance within T hours. */

import java.util.*;
class TIME_party{
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    int n=ob.nextInt();
    int[] e=new int[n];
    int[] l=new int[n];
    for(int i=0;i<n;i++)
    {
      e[i]=ob.nextInt();
    }
    for(int i=0;i<n;i++)
    {
      l[i]=ob.nextInt();
    }
    int max=0,cur=0;
    for(int i=0;i<n;i++)
    {
      cur+=e[i]-l[i];
      max=Math.max(max,cur);
    }
    System.out.print(max);
  }
}