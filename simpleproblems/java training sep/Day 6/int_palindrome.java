import java.util.*;
public class int_palindrome {
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int m=ob.nextInt();
        for(int i=n;i<m;i++)
        {
            int num=i;
            int rev=0;
            while(num!=0)
            {
                int digit=num%10;
                rev=rev*10+digit;
                num=num/10;
            }
            if(i==rev)
                System.out.println(i);
        }
    }
}
