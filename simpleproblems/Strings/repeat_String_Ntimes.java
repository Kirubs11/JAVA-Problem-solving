import java.util.*;
class repeat_String_Ntimes
{
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        String s=ob.next();
        String ss="";
        for(int i=0;i<n;i++)
        {
            ss+=s;
        }
        System.out.print(ss);
    }
}