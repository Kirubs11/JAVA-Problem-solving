import java.util.*;
class Max_in_Array
{
    public static void main(String[] args)
    {
        Scanner ob= new Scanner(System.in);
        int n=ob.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        int max=arr[0];
        int pos=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                pos=i;
            }
        }
        System.out.println("Maximum element in the array is: "+max+" position of that element: "+pos);
    }
}