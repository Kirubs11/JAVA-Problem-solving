import java.util.*;
class multiply
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        int[] newarr=new int[n];
        int c=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    c*=arr[j];
                    newarr[i]=c;
                }
            }
            c=1;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(newarr[i]+" ");
        }
    }
}