import java.util.*;
class ball_problem
{
    public static void main(String[]rags)
    {
        Scanner ob=new Scanner(System.in);
        System.out.print("h = ");
        int h=ob.nextInt();
        System.out.print("v = ");
        int v=ob.nextInt();
        System.out.print("vn = "); 
        int vn=ob.nextInt();
        int en=v/vn;
        System.out.println("en = " + en);
        h=h*(en*en);
        System.out.println("h = " + h);

    }
}