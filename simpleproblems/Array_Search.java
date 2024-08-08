/*Complete the function Search_element(), which receives number of elements,array and search element as input.
Function should find and return 1 if search element is found in the input array, return 0 if not found.*/


import java.util.*;
class Array_Search{
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    int[] a={1,2,3,4,5,6,7,8,9,10};
    int key=ob.nextInt();
    int i=0,b=0;
    for(i=0;i<n;i++)
    {
      if(a[i]==key){ b=key;
      break;}
      
    }
    if(b==key)
    {
      System.out.print("Found");
    }
    else System.out.print("Not found");
  }
}
