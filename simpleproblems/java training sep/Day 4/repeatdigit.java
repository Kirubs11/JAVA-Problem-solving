import java.util.*;
class main{
    public static void main(String[] args) 
    {
        Scanner ob=new Scanner(System.in);
        int a=ob.nextInt();
        int b=ob.nextInt();
        int sum=0;
        for(int i=a;i<=b;i++)
        {
            if(check(i)) sum++;
        }
    }
    public static boolean check(int i)
    {
        ArrayList<Integer> list=new ArrayList<Integer>();
        int len=String.valueOf(i).length;
        while(i!=0)
        {
            int last=i%10;
            if(!list.contains(last))
                {
                    list.add(last);
                }
                i=i/10;
        }
        return list.size()==len;
    }
