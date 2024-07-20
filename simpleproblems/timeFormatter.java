// Write a program to read the total seconds and print the seconds in time formet Examble :hr:min:sec

import java.util.*;
class timeFormatter{
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    long a=ob.nextLong();
    long h=a/3600;
    long ms=a%3600;
    long m=ms/60;
    long s=a%60;
    System.out.printf("%02d:HOUR %02dMIN :%02dSEC",h,m,s);
  }
}