import java.util.*;
class find
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
        System.out.println("Enter item to find price : ");
        String str=ob.nextLine();
        if(men.ContainsKey(str))
        {
            System.out.println("Found");
        }
        else
        {
            System.out.println("Not Found");


    }
}