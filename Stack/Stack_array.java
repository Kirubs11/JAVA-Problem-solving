import java.util.*;
class Stack_array
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements to push :");
        int n = sc.nextInt();

        
        System.out.println("\nEnter the elements to PUSH :");
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        
        System.out.println("Elements in the array :");
        for(int i = 0; i < n; i++)
        {
            System.out.printf("%d ",arr[i]);
        }
       
       
        System.out.println("\nAfter poping the element :");
        int count = 0;
        for(int i = 0; i < n-1; i++)
        {
            count++;
            System.out.print(arr[i] + " ");
        }
       
        
        System.out.println("\nThe TOP element  is : " + arr[count-1]);
}
}