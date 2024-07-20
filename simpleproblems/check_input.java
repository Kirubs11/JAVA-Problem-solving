/*Given 2 integer input check whether the 2 input are "Equal" or "Not Equal" and print the corresponding message.*/

import java.util.*;
class check_input{
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    int a=ob.nextInt();
    int b=ob.nextInt();
    if(a==b)
    {
      System.out.printf("Equal");
    }
    else{
      System.out.printf("Not Equal");
    }
  }
}