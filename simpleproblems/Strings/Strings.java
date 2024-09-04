import java.util.*;
class Strings
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        ArrayList <String>list = new ArrayList<>();
        while(true)
        {
            
            int  val = s.nextInt();
            if(val != -1)
            {
                
                String str = s.next();
                list.add(str);
            }
            else
            {
                break;
            }
            
        }
        System.out.print(list);
        System.out.println();
        for(int i = list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i)+ " ");
        }    
        
        System.out.println();
        ArrayList <String>list1 = new ArrayList<>();
        while(true)
        {
            
            int  val1 = s.nextInt();
            if(val1 != -1)
            {
                
                String str1 = s.next();
                list1.add(str1);
            }
            else
            {
                break;
            }
            
        }
        System.out.print(list1);
        int i,j;
        int count=0;
        // while(true)
        // {
        //     if(list.get(i) == list1.get(j))
        //     {
        //         i++;
        //         j++;
        //     }
        //     else{
        //         count=1;
        //         break;
        //     }
        // }

        for(i=0;i<list.size();i++)
        {
            for(int j=0;)
        }
        if(count==0)
        {
            System.out.print("true");
        }

        else 
        {
            System.out.print("false");
        }
    }


}