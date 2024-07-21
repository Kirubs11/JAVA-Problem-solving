// Accept an integer value and print the corresponding character associated with the integer value

import java.util.*;
class CHAR_WITH_INTEGER
{
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    int a=ob.nextInt();
    char b=(char)a;
    System.out.printf("%d:%c",a,b);
  }
}