// Multiply two decimal numbers and print the product with a precision of 2 decimal places .

import java.util.*;
class Multiply_precisios{
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    double a=ob.nextDouble();
    double b=ob.nextDouble();
    double c=a*b;
    System.out.printf("%.2f",c);
    ob.close();
  }
}