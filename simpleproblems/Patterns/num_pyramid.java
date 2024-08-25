import java.util.*;
class num_pyramid
{
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        int count=0;
        int n=ob.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            
            for(int k=1;k<=i;k++)
            {
                count+=1;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
}