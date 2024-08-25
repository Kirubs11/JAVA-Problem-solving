import java.util.*;
class square{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        for(int i=0;i<n;i++)
        {
            if(i==0 || i==n-1)
            {
                for(int j=0;j<n;j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
            else
            {
                for(int k=0;k<n;k++)
                {
                    if(k==0 || k==n-1)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print("  ");
                    }
                } System.out.println();
            }
        }
    }
}