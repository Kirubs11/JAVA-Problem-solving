import java.util.*;
class node{
  int data;
  node next;
  node prev;
  
  node(int data)
  {
    this.data=data;
    this.next=null;
    this.prev=null;
  }
}
class doubl{
  node head;
  node tail;
  
  doubl()
  {
    head=null;
    tail=null;
  }
  public void insert(int data)
  {
    node nn=new node(data);
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
    node temp=tail;
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