import java.util.*;
class mulply_wo_index
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] ar=new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=ob.nextInt();
        }
        int[] res=new int[n];
        for(int i=0;i<n;i++)
        {
            int sum=1;
            for(int j=0;j<n;j++)
            {
                if(i!=j)
                {
                    sum*=ar[j];
                }
            }
            res[i]=sum;
            System.out.print(res[i]+" ");
        }
    }
}