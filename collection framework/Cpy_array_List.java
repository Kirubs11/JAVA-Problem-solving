import java.util.*;
public class Cpy_array_List {
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        int count=0;
        while(true)
        {
            int val=ob.nextInt();
            if(val==-1) break;
            list.add(val);
            count++;
        }
        System.out.println("original list: " + list);
        for(int i=0;i<count;i++)
        {
            list2.add(list.get(i));
        }
        System.out.println("list2: " + list2);
    }
}
