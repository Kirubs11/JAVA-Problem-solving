/*Complete the function uppercase(), to remove all characters other than upper case letters from the given string and do return the string.
Note:Dont use extra string work inplace*/

import java.util.*;
class remove_lowercase{
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    String a=ob.nextLine();
    String b=remove(a);
    System.out.print(b);
  }
  public static String remove(String a){
    return a.replaceAll("[^A-Z]", "");
  }
}