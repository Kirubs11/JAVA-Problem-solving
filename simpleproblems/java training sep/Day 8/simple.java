import java.util.*;
public class simple {
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        int b=ob.nextInt();
        if(a*b>12)
        {
            a=a*b-12;
            if(a>24)
            {
                System.out.println("-1");
            }
            else
            {
                System.out.println(a);
            }
        }
        else
        {
            a=a*b;
            System.out.println(a);
        }
        
    }
}
