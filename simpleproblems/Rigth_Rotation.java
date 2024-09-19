import java.util.*;
class Rigth_Rotation{
  public static void main(String[] args)
  {
    Scanner ob=new Scanner(System.in);
    int n=ob.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
    {
      a[i]=ob.nextInt();
    }
    int r=ob.nextInt();
    int[] res=new int[n];
    for(int i=0;i<n;i++)
    {
      res[i]=a[(i-r+n)%n];
    }
    for(int i=0;i<n;i++)
    {
      System.out.printf("%d ",res[i]);
    }
  }
}
