/*Given an integer value, check the given input is divisible by 3. If it is divisible print the message "The number is divisible by 3".
if it is not divisible print the message "The number is not divisible by 3 and gives a remainder _". */

import java.util.*;
class divisible_3{
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    long a=ob.nextLong();
    if(a%3==0)
    {
      System.out.printf("The number is divisible by 3");
    }
    else{
      System.out.printf("The number is not divisible by 3 and gives a remainder %d",a%3);
    }
  }
}