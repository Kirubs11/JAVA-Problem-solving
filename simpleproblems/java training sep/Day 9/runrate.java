import java.util.*;
class runrate
{
    public static void main(String[] rags)
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int m=ob.nextInt();
        int r=ob.nextInt();
        int w=ob.nextInt();
        int[] runs=new int[w];
        for(int i=0;i<w;i++)
        {
            runs[i]=ob.nextInt();
        }
        int totalRuns=0;
        for(int i=0;i<w;i++)
        {
            totalRuns+=runs[i];
        }
        if((n*r)-totalRuns<m)
        {
            System.out.println("Run rate is " + totalRuns + " runs");
        }
        else
        {
            System.out.println("-1");
        }

    }
}