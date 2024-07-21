// Accept a character and print its corresponding ASCII value.import java.util.*;

class ASCIval{
  public static void main(String[] args){
    Scanner ob=new Scanner(System.in);
    char a=ob.next().charAt(0);
    int b=(int)a;
    System.out.printf("%c:%d",a,b);
  }
}