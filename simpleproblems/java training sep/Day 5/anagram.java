import java.util.*;
public class anagram {
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        String s=ob.nextLine();
        String ss=ob.nextLine();
        if(s.length()!=ss.length()) 
        {
            System.out.print("Given String is not an anagram");
        }
        else
        {
            char[] a=s.toCharArray();
            char[] b=ss.toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if(Arrays.equals(a,b))
            {
                System.out.print("given String is anagram");
            }
            else{
                System.out.print("given String is not anagram");
            }
        } 
    }
}
