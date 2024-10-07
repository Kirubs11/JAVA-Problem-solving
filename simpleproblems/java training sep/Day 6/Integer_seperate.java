import java.util.*;
public class Integer_seperate {
    public static void main(String[] args) 
    {
        Scanner ob=new Scanner(System.in);
        String a=ob.nextLine();
        a=a+" ";
        char[] c=a.toCharArray();
        String s="";
        for(int i=0;i<a.length();i++)
        {
            if(c[i]>='0' && c[i]<='9')
            {
                s+=c[i];
                if(!(c[i+1]>='0' && c[i+1]<='9')) s+=" ";
            }
        }
        System.out.println(s);

    }
    
}
