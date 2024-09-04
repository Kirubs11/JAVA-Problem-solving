import java.util.*;
public class Strrev {
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        String ns="";
        String w="";
        int i=0;
        while(i<=s.length())
        {
            char c=s.charAt(i);
            if(c!=' ')
            {
                w=c+w;
                i++;
            }
            else
            {
                ns = ns + w + " ";
                i++;
            }
        }
        System.out.print(ns);
    }
}
