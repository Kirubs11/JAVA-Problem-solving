import java.util.*;
class 0_1_pattern
{
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if((i+j)%2==0)
                {
                    System.out.print("1 ");
                }
                else
                {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}