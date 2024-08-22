import java.util.*;
class Sequence_of_2_3
{
  public static void main(String[] args)
  {
    Scanner ob=new Scanner(System.in);
    int n=ob.nextInt();
    int[] arr=new int[n];
    int j=0;
    int k=0;
    for(int i=0;i<n;i++)
    {
      if(i==0)
      {
        arr[i]=1;
        j++;
      }
      else if(i%2==0)
      {
        arr[i]=(int)Math.pow(2,j);
        j++;
      }
      else
      {
        arr[i]=(int)Math.pow(3,k);
        k++;
      }
    }
    for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]+" ");
    }
  }
}