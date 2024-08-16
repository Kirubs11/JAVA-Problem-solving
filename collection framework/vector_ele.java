import java.util.*;
public class vector_ele {
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();
        while(true)
        {
            int val=ob.nextInt();
            if(val==-1) break;
            v.add(val);
        }
        System.out.print(v);
        System.out.printf("\nSize of vector Collection : %d",v.size());

        System.out.println("\nEnter the element and position to insert :");
        int index=ob.nextInt();
        int value=ob.nextInt();
        v.add(index,value);
        System.out.println("After inserting : "+v);
    }
}
