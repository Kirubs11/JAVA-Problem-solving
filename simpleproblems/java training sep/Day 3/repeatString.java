import java.util.*;
class repeatString
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        boolean found = find(input);
        System.out.println(found);
    }
        static boolean find(String input)
        {
            ArrayList<Character> list = new ArrayList<>();
            for(int i=0;i<input.length();i++)
            {
                if(list.contains(input.charAt(i)))
                {
                    return false;
                }
                list.add(input.charAt(i));
            }
            return true;
        } 
}