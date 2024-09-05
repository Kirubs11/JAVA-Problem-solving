import java.util.*;
class Skip_RepatedDigits
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int start=ob.nextInt();
        int end=ob.nextInt();
        while(start<=end)
        {
            if(start<100)
            {
                if(start%11!=0) System.out.print(start);
            }

            else
            {
                int num=start;
                int a=0;
                while(num>0)
                {
                    int rem=num%10;
                    Set<Integer> set=new HashSet<Integer>();
                    if(set.contains(rem))
                    {
                        a=1;
                        break;
                    }
                    set.add(rem);
                    num/=10;
                }
                if(a==0) System.out.print(start + " ");
            }
            start++;
        }
    }
}