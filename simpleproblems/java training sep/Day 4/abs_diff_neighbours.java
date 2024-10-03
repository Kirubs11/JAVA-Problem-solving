import java.util.*;
class abs_diff_neighbours
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum=0;
        int a=0;
        for(int i = 0; i < n; i++)
        {
            if(i==n-1) a=0;
            else
            {  
                a=i+1;
            }
            
            sum+=Math.abs(arr[i]-arr[a]);

        }
        System.out.print(sum);
    }
}