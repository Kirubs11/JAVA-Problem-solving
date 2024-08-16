import java.util.*;
public class que {
    public static void main(String[] args)
    {
        Scanner ob=new Scanner (System.in);
        ArrayDeque<Integer> queue=new ArrayDeque<Integer>();
        int val=0;
        while(true)
        {
            val=ob.nextInt();
            if(val==-1) break;
            queue.add(val);
        }
        for(int ele:queue)
        {
            System.out.printf("%d ",ele);
        }
    }
}
