// Given Degree as input,Convert it into Radian using the formulae  Radian = degree * ( M_PI / 180.0 )) (Use M_PI function for pi value)

import java.util.*;
class DEGREE_TO_Radian{
  public static void main(String[]args)
  {
    double d=3.141414;
    Scanner ob=new Scanner(System.in);
    double a=ob.nextDouble();
    double b=a*(d/180.0);
    System.out.printf("%.2f",b);
  }
}
