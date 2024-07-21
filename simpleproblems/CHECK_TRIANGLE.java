// Input all angles of a Triangle and check whether it is "Valid" or "Not Valid"

import java.util.*;
class CHECK_TRIANGLE{
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    int a=ob.nextInt();
    int b=ob.nextInt();
    int c=ob.nextInt();
    if((a+b+c==180)&&(a>0)&& b>0 && c>0)
    {
      System.out.print("Valid");
    }
    else{
      System.out.print("Not Valid");
    }
  }
}