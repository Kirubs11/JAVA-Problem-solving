import java.util.*;
public class Star_pattern {
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            for(int k=i;k<n;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n-1;j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
