/*  
 
 * * * * 
  * * * * 
   * * * * 
    * * * * 

     */

import java.util.*;
class rhombus_pattern
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=n;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

