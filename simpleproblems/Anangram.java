import java.util.*;

public class Anangram {

    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        String a=ob.next();
        String a1=a.toLowerCase();
        String b=ob.next();
        String b1=b.toLowerCase();
        int i=a.length();
        int j=b.length();
        if(i!=j)
        {
            System.out.print("Not Anagrams");  
        }
        else{
        int count=0;
        char[] c=a1.toCharArray();
        char[] d=b1.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
        int k=0;
        while(k<i)
        {
         if(c[k]==d[k])
            {
                k++;
            }
            else
            {
                count+=1;
                System.out.print("Not Anagrams");
                break;
            }
        }
    if(count==0)
    {
        System.out.print("Anagrams");
    }
        }
    }
}
