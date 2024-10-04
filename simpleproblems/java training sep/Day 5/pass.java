import java.util.*;

class pass {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        String s = ob.nextLine();
        if (s.length() < 4) {
            System.out.println("Enter a proper password");
        } else {
            System.out.println(ceck(s));
        }
    }

    public static boolean ceck(String s) {
        boolean a = false;
        boolean b = false;

        if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
            return false;
        }

        for (int i = 0; i < s.length(); i++) 
        {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') 
            {
                a = true;
            }
            else if (c >= '0' && c <= '9') 
            {
                b = true;
            }
            else if (c == ' ' || c == '/') 
            {
                return false;
            }
        }

        return a && b;
    }
}
