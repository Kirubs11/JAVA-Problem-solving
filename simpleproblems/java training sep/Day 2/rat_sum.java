import java.util.*;
class rat_sum
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int r=ob.nextInt();
        int unit=ob.nextInt();
        int n=ob.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        int sum=0;
        int count=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
            count++;
            if(sum>=r*unit)
            {
                break;
            }
            else if(i==n-1 && sum<=r*unit)
            {
                count=0;
                break;
            }

        }
        System.out.println("Total house that rats used : " +count);
    }
}