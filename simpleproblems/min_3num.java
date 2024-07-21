// Find the minimum of 3 numbers 

import java.util.*;
class min_3num{
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    long a=ob.nextLong();
    long b=ob.nextLong();
    long c=ob.nextLong();
    if(a<b && a<c){
      System.out.printf("Minimum is %d",a);
    }
    else if(b<a && b<c)
    {
      System.out.printf("Minimum is %d",b);
    }
    else{
      System.out.printf("Minimum is %d",c);
    }
  }
}