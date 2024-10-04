import java.util.*;
class diff_sum
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int m=ob.nextInt();
        System.out.println(check(n,m));
    }

    public static int check(int n, int m)
    {
        int sum=0;
        int s=0;
        for(int i=1;i<=m;i++)
        {
            if(i%n==0)
            {
                sum+=i;
            }
            else
            {
                s+=i;
            }
        }
        return s-sum;
    }
}