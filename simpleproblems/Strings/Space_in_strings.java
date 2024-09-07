import java.util.*;
class Space_in_strings
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        String s=ob.next();
        int i=0;
        while(i<s.length())
        {
            char c=s.charAt(i);
            if(c>='A' && c<='Z')
            {
                if(i!=0)
                {
                    System.out.print(" "+(char)(c+32));
                }
                else
                {
                    System.out.print((char)(c+32));
                }
            }
            else
            {
                System.out.print(c);
            }
            i++;
        }
    }
}

/* Input is 
    HeyYou.

   Output is
    hey you.
*/
