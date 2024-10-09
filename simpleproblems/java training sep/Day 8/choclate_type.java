import java.util.*;
class choclate_type
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
        int t=ob.nextInt();
        Arrays.sort(arr);
        int sum=0;
        for(int i=0;i<t;i++)
        {
            sum+=arr[i];
        }
        System.out.print(sum);
    }
}