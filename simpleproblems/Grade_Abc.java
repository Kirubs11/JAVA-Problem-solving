/* 91= A \\n\\n2. 76<=marks<=90 B\\n\\n3. 61<=marks<=75 C \\n\\n4. marks<=60 D"}'>Based on the given marks, print the corresponding grade according to the following conditions Given a particular marks, a grade is calculated as per the following table:
Score                          Grade

1. marks>=91                 A

2. 76<=marks<=90         B

3. 61<=marks<=75         C

4.   marks<=60                D   */

import java.util.*;
class Grade_Abc{
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    long a=ob.nextLong();
    if(a>=91)
    {
      System.out.print("Grade A");
    }
    else if(a>=76)
    {
      System.out.print("Grade B");
    }
    else if(a>=61)
    {
      System.out.print("Grade C");
    }
    else{
      System.out.print("Grade D");
    }
  }
}
