import java.util.*;
class mid1_num_pyramid
{
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print("  ");
            }
            for(int j=i;j>1;j--)
            {
                System.out.print(j+" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}