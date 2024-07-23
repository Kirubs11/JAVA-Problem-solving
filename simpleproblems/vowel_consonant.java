//Check whether the given character is a Vowel or Consonant

import java.util.*;
class vowel_consonant{
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    char a=ob.next().charAt(0);
    if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
    {
      System.out.print("Vowel");
    }
    else{
      System.out.print("Consonant");
    }
  }
}