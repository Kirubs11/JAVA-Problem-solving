import java.util.*;
class bmi
{
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        int weight=ob.nextInt();
        float height=ob.nextFloat()/100;
        float bmi=weight/(height*height);
        System.out.println("Calculated bmi is : "+bmi);
        if(bmi<18)
        {
            System.out.println("0");
        }
        else if(bmi>=18 && bmi<25)
        {
            System.out.println("1");
        }
        else if(bmi>=25 && bmi<30)
        {
            System.out.println("2");
        }
        else if(bmi>=30 && bmi<40)
        {
            System.out.println("3");
        }
        else{
            System.out.println("4");
        }
    }
}