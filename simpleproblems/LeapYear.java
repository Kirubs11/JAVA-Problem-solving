// Given a year, check whether it is a leap year

import java.util.*;
class LeapYear
{
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    int a=ob.nextInt();
    if((a%4==0 && a%100 !=0)||a%400==0)
    {
      System.out.printf("Leap year");
    }
    else{
      System.out.printf("Not a Leap year");
    }
  }
}