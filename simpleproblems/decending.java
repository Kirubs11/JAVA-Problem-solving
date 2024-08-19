import java.util.*;
public class decending {
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        Set<Integer> set=new HashSet<>();
        while(true)
        {
            int val=ob.nextInt();
            if(val==-1) break;
            set.add(val);
        }
        System.out.print(set);
        System.out.println("\nDescending order of elements:");
        ArrayList<Integer> list=new ArrayList<>(set);
        for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(i)<list.get(j))
                {
                    int temp=list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,temp);
                }
            }
        }
        System.out.print(list);
    }
}
