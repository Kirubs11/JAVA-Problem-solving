import java.util.*;
class Node{
  int data;
  Node next;
  Node prev;
  
  Node(int data)
  {
    this.data=data;
    this.next=null;
    this.prev=null;
  }
}
class doubl{
  Node head;
  Node tail;
  
  doubl()
  {
    head=null;
    tail=null;
  }
  public void insert(int data)
  {
    Node nn=new Node(data);
    if(head==null)
    {
      head=nn;
      tail=nn;
    }
    else
    {
      tail.next=nn;
      nn.prev=tail;
      tail=nn;
    }
  }
  public void reverse()
  {
    Node temp=tail;
    while(temp!=null)
    {
      System.out.printf("%d ",temp.data);
      temp=temp.prev;
    }
  }
}
class Main{
  public static void main(String[] args)
  {
    Scanner ob=new Scanner(System.in);
    doubl db=new doubl();
    int val=0;
    while(val!=-1)
    {
      val=ob.nextInt();
      if(val==-1)break;
      db.insert(val);
    }
    db.reverse();
  }
}