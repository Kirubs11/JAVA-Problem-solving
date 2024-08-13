// Given a number, check whether it is "Odd" or "Even"

import java.util.*;
class Odd_Even{
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    int a=ob.nextInt();
    if(a%2==0)
    {
      System.out.printf("EVEN");
    }
    else
    {
      System.out.printf("ODD");
    }
  }
}
