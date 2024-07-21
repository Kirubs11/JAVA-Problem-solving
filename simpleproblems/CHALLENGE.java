/*  Accept a number as input which will be 1 or 2 ,  If it is 1, print 2. If it is 2, print 1.
(without using conditional statement)*/

import java.util.*;
class CHALLENGE{
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    int a=ob.nextInt();
    int b=3-a;
    System.out.printf("%d",b);
  }
}