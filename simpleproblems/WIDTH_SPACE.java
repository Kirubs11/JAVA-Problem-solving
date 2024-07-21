// Accept a floating point value and print it with 20 width space and round off to 4 decimal places.

import java.util.*;
class WIDTH_SPACE{
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    double a=ob.nextDouble();
    System.out.printf("%20.4f",a);
  }
}