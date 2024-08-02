/* 
Given a set of values as a input from the user, your task is to create and display the first two peek values from the priority queue.
Your class must contain data class that creates a place to hold value and priority.
Create enqueue for adding an element and dequeue for the removal process and peek to assess the highest priority element.

Input Format:
First line of the input contains N number of values(Value , priority) to be processed.
Next line contains the values and its priorities.

Output Format:
Display two peek  valuses from the queue of values based on highest priority.

Constraints:

1<= N <=10000

1<= values <=100000

1<= priority <=10000

Sample Input 1:

4
10 3 12 5 15 2 15 1

Sample Output 1:

12
10

Sample Input 2:

5
6 6 3 1 4 8 2 2 7 3

Sample Output 2:

4
6  */


import java.util.*;
class node
{
  int data;
  int pri;
  node next;
  
  node(int data,int pri)
  {
    this.data=data;
    this.pri=pri;
    this.next=null;
  }
}
class Top2_Peek_PriorityEnqueue
{
  node head;
  
  Top2_Peek_PriorityEnqueue()
  {
    head=null;
  }
  
  void enqueue(int data,int pri)
  {
    node nn=new node(data,pri);
    if(head==null)
    {
      head=nn;
    }
    else
    {
      if(head.pri<pri)
      {
        nn.next=head;
        head=nn;
      }
      else
      {
        node temp=head;
        while(temp.next!=null && temp.next.pri>=pri)
        {
          temp=temp.next;
        }
        nn.next=temp.next;
        temp.next=nn;
      }
    }
  }
  // void dequeue()
  // {
  //   head=head.next;          
  // }
  void display()
  {
    node temp=head;
    for(int i=0;i<=1;i++)
    {
      System.out.println(temp.data);
      temp=temp.next;
    }
  }
  public static void main(String args[])
  {
    Scanner ob=new Scanner(System.in);
    int n=ob.nextInt();
    Top2_Peek_PriorityEnqueue m=new Top2_Peek_PriorityEnqueue();
    int val=0,pri=0;
    for(int i=0;i<n;i++)
    {
      val=ob.nextInt();
      pri=ob.nextInt();
      m.enqueue(val,pri);
    }
    // m.dequeue();
    m.display();
  }
}