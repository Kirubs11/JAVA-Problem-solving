import java.util.*;
public class remove_repeatString {
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        String str=ob.nextLine();
        char[] words=str.toCharArray();
        Set<Character> set=new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            if(!set.contains(words[i])) 
            {
                set.add(words[i]);
                System.out.println(words[i]);
            }
        }
    }
}
