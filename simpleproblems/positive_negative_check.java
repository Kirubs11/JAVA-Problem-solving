// Given an integer input , whether the given input is "Positive" or "Negative" or "Zero" and print the corresponding message

import java.util.*;
class positive_negative_check{
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    int a=ob.nextInt();
    if (a<0)
    {
      System.out.printf("NEGATIVE");
    }
    else if(a>0)
    {
      System.out.printf("POSITIVE");
    }
    else if(a==0){
      System.out.printf("ZERO");
    }
  }
}