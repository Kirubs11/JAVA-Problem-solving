// Write a program to input a given specific date and check whether the date is valid or not. Year will be in range 1900 to 9999

import java.util.*;
class VALID_DATE{
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    String []date=ob.nextLine().split("/");
    int d=Integer.parseInt(date[0]);
    int m=Integer.parseInt(date[1]);
    int y=Integer.parseInt(date[2]);
    if((y%4==0 && y%100!=0)||y%400==0)
    {
    System.out.print("Invalid");  
}
}}