/*Complete the function RemoveVowels(), to remove all vowles from the given string and do return the string.
Note:Dont use extra string work inplace*/

import java.util.*;
class remove_vowel{
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    String a=ob.nextLine();
    String res=removeVowels(a);
    System.out.print(res);
  }
  public static String removeVowels(String a){
    return a.replaceAll("[aeiouAEIOU]", "");
  }
}
