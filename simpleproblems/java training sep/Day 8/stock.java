import java.util.*;
public class stock {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int n=ob.nextInt();
        int[] stocks = new int[n];
        for(int i=0; i<n; i++)
        {
            stocks[i] = ob.nextInt();
        }
        int c=0;
        if(stocks[0]<0) c++;
        for(int i=1; i<n; i++)
        {
                if(stocks[i]<0) c++;
                else if(stocks[i-1] > stocks[i])
                {
                    c++;
                }
        }
        System.out.println("Count = "+c);
}
}
