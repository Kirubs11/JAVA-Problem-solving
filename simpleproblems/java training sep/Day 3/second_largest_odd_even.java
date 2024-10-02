import java.util.*;
class second_largest_odd_even
{
    public static void main(String[] args) 
    {
        Scanner ob = new Scanner(System.in);
        int n=ob.nextInt();
        int[] ar=new int[n];
        if(n<=3) System.out.println("invalid SIZE");
        else
        {
            for(int i=0; i<n; i++)
            {
                ar[i]=ob.nextInt();
            }
            Arrays.sort(ar);
            int sum=ar[n-4]+ar[n-3];
            System.out.println("sum of second largest odd and even : " +sum);
        }
    }
}