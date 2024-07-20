// Print the middle N nodes of a circular singly linked list

import java.util.*;
class node
{
  int data;
  node next;
  node(int data)
  {
    this.data=data;
    this.next=null;
  }
}
class sc
{
  node head;
  node last;
  
  sc()
  {
    head=null;
    last=null;
  }
  void insert(int data)
  {
    node nn=new node(data);
    if(head==null)
    {
      head=nn;
      last=nn;
    }
    else
    {
      last.next=nn;
      nn.next=head;
      last=nn;
    }
  }
  void mid(int c)
  {
    node temp=head;
    for(int i=0;i<c;i++)
    {
      temp=temp.next;
    }
    System.out.print(temp.data);
  }
}
class middle_node
{
  public static void main(String[]args)
  {
    Scanner ob=new Scanner(System.in);
    sc l=new sc();
    int val=0;
    int c=0;
    while(val!=-1)
    {
      val=ob.nextInt();
      if(val==-1)break;
      l.insert(val);
      c++;
    }
    l.mid(c/2);
  }
}