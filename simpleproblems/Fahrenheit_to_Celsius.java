// Given the temperature of the day as Celsius as input. Do convert Celsius into Fahrenheit using the formulae: Fahrenheit = ((celcius*9) /5)+32.

import java.util.*;
class Fahrenheit_to_Celsius{
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    double a=ob.nextDouble();
    double f=((a*9)/5)+32;
    System.out.printf("%.2fF",f);
  }
}