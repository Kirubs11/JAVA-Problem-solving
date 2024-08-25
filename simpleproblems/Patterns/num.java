import java.util.*;
class num
{
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        for(int i=n;i>=1;i--)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}