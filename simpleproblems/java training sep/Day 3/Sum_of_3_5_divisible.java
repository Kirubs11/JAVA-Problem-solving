import java.util.*;
class Sum_of_3_5_divisible{
    public static void main(String[] args){
        Scanner obs = new Scanner(System.in);
        int m=obs.nextInt();
        int n=obs.nextInt();
        int sum=0;
        for(int i=m;i<=n;i++)
        {
            if(i%3==0 && i%5==0)
            {
                sum+=i;
            }
        }
        System.out.println("Sum of all numbers between "+m+" and "+n+" which are divisible by both 3 and 5 is: "+sum);
    }
}