// Check whether a given string is a hexadecimal number


import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class hexadecimal{
  public static final Pattern HEXADECIMAL_PATTERN=Pattern.compile("[0-9A-F]+");
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    String a=ob.nextLine();
    System.out.println(isHexadecimal(a)?"YES":"NO");
  }
  public static boolean isHexadecimal(String input){
    Matcher matcher=HEXADECIMAL_PATTERN.matcher(input);
    return matcher.matches();
  }
}