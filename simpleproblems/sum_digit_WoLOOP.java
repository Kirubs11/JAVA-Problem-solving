import java.util.*;
public class sum_digit_WoLOOP{
    
    public static int SumOfDigits(int num)
    {
        if(num==0){ return 0;}
        return (num%10)+ SumOfDigits(num/10);
    }
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=ob.nextInt();
        int sum=SumOfDigits(num);
        System.out.printf("The Sum of %d is : %d\n",num,sum);
    }
}
