import java.util.*;
class choc
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int c=ob.nextInt();
        int p=ob.nextInt();
        int sum=0;
        for(int i=1; i<=p; i++)
        {
            sum+=c;
            c=sum-1;
        }
        System.out.println(sum);
    }
}