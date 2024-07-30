
import java.util.*;
public class duplicate {
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=ob.nextInt();
        }
        try {
            check(arr);
            System.out.print("No duplicate numbers");=
        }
        catch(Exception e)
        {
            System.out.print(e.getMessage());
        }
    }
    public static void check(int[] arr) throws Exception
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    throw new Exception("Error:Duplicate number found:" + arr[i]);
                }
            }
        }
    }
}