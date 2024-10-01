import java.util.*;
class Steps
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n+2];
        for(int i=0;i<n+2;i++)
        {
            if(i==0) arr[i]=0;
            else if(i==1) arr[i]=1;
            else
            {
                arr[i]=arr[i-1]+arr[i-2];
            }
        }
        System.out.println("The "+n+"th number in the sequence is: " + arr[n+1]);
    }
}