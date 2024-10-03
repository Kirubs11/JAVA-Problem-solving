import java.util.*;
public class abs_diff_neighbours_altered {
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = ob.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = ob.nextInt();
        }
        Arrays.sort(arr);
        int sum=0;
        for(int i = 0; i < n; i++)
        {
            if(i==0)
            {
                sum += Math.abs( arr[i] - arr[i+1] );
            }
            else if( i == n-1 )
            {
                sum+=Math.abs ( arr[i] - arr[i-1] );
            }
            else{
                sum +=Math.min( Math.abs( arr[i] - arr[i+1] ) , Math.abs( arr[i] - arr[i-1] ));
            }
        }
        System.out.print(sum);
    }
    
}
