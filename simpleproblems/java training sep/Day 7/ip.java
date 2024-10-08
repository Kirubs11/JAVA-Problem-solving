import java.util.*;
public class ip {
    public static void main(String[] args) 
    {
        Scanner ob=new Scanner(System.in);
        String ip=ob.nextLine();
        String[] IP=ip.split(".");
        for(int i=0; i<IP.length; i++)
        {
            int num=Integer.parseInt(IP[i]);
            if(IP[i]>255)
            {
                System.out.println("invalid ip");
                break;
            }
        }
        System.out.println("Valid");
    }
}
