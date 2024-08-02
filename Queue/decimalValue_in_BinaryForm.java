/*Problem Statement:

Given a range, print each decimal value in binary form as space separated. Do generate the binary form of the decimal values by reusing the generated binary value as First In First Out mechanism using Singly Linked List

Input Format:

Accept an integer as input

Output Format:

Print the generated binary form as space separated

Constraints:

1<= input < =1000

Sample Input 1:

3

Sample Output 1:

1 10 11

Sample Input 2:

5

Sample Output 2:

1 10 11 100 101  {
    
}*/

import java.util.*;
class decimalValue_in_BinaryForm
{
  public static void gen(int n )
  {
    Queue<String> qu=new LinkedList<>();
    qu.add("1");
    for(int i=1;i<=n;i++)
    {
      String cur=qu.poll();
      System.out.print(cur + " ");
      qu.add(cur + "0");
      qu.add(cur + "1");
    }
  }
  
  public static void main(String args [])
  {
    Scanner ob=new Scanner(System.in);
    int n=ob.nextInt();
    gen(n);
  }
}
