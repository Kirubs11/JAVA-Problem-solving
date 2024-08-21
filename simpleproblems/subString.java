/* Sample Input

Helloworld
3 7
Sample Output

lowo  */

import java.util.*;
public class subString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        String w="";
        int start = in.nextInt();
        int end = in.nextInt();
        for(int i=0;i<S.length();i++)
        {
            if(i>=start && i<end )
            {
                char c=S.charAt(i);              
                w+=c;
            }
            
        }
        System.out.print(w);
    }
}
