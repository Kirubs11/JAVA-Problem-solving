import java.util.*;
class Cpy_vector {
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        Vector<Integer> v = new Vector<Integer>();
        Vector<Integer> v2 = new Vector<Integer>();
        int count=0;
        while(true)
        {
            int val=ob.nextInt();
            if(val==-1) break;
            v.add(val);
            count++;
        }
        System.out.println("original vector: " + v);
        for(int i=0;i<count;i++)
        {
            v2.add(v.get(i));
        }
        System.out.println("Copied vector: " + v2);
    }
}
