import java.util.*;
public class table {
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int range=ob.nextInt();
        int sum=0;
        for(int i=1;i<=range;i++)
        {
            int s=i*n;
            sum+=s;
            System.out.println(n+" x "+i+" = "+s);
        }
        System.out.println("Sum of numbers is: "+sum);
    }
}
