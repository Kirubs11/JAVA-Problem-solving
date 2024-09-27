_import java.util.*;
class String_Encode
{
  public static void main(String[] args)
  {
    String en="";
    Scanner ob=new Scanner(System.in);
    String a=ob.nextLine();
    int n=ob.nextInt();
    for(int i=0;i<a.length();i++)
    {
      char c=a.charAt(i);
      if(c==' ') c-=n;
      c+=n;
      en+=c;
    }
    System.out.printf("The encrypted text is : %s",en);
  }
}
