import java.io.*;
import java.util.*;

public class Stringcharremove

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner ob=new Scanner(System.in);
        String w="";
        int cnt=0;
        String[] s=ob.nextLine().split("[ ,''?!_]+");        
        int i;
        System.out.println(s.length);
        for(i=0;i<s.length;i++)
        {
            String c=s[i];      
            System.out.println(c);
        }
    }
}
