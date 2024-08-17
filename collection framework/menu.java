import java.util.*;
class menu
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        HashMap<String,Integer> men=new HashMap<String,Integer>();
        while(true)
        {
            System.out.println("Enter item name and price : ");
            String item=ob.next();
            if(item.equals("-1")) break;
            int price=ob.nextInt();
            men.put(item,price);
        }
        System.out.println(men);
    }
}