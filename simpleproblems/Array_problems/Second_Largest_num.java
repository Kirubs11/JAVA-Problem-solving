import java.util.*;
public class Second_Largest_num {
    
public static void main(String[] args)
{
    Scanner ob=new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int size = ob.nextInt();
    int[] arr = new int[size];
    System.out.println("Enter the element of the array : ");
    for(int i=0; i<size; i++)
    {
        arr[i] = ob.nextInt();
    }
    int first=0;
    int second=0;
    for(int ele : arr)
    {
        if(ele > first)
        {
            second = first;
            first = ele;
        }
        else if(ele > second && ele != first)
        {
            second = ele;
        }
    }
    System.out.println("Second largest element in the array : "+second);
}
}
