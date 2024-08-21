import java.io.*;
import java.util.*;

public class String_palindrome {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner ob=new Scanner(System.in);
        String s=ob.next();
        int n=s.length();
        int i=0;
        int j=n-1;
        int c=0;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                c=1;
                break;
            }
        }
        if(c==0) System.out.print("Yes");
        else System.out.print("No");
    }
}