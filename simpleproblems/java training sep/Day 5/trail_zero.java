import java.util.*;
class trail_zero
{
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        double n=ob.nextInt();
        System.out.println(check(n));
    }
    public static int check(double n)
    {
        int count=0;
        int s=5;
        while(n>=s)
        {
            count+=n/s;
            s=s*5;
        }
        return count;
    }
}