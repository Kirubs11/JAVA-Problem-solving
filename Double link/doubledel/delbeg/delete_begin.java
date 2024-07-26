import java.util.*;
class node{
    int data;
    node next;
    node prev;
    node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
class delete_begin
{
    node head;
    node tail;
    delete_begin()
    {
        head = null;
        tail = null;
    }
    void insert(int data){
        node nn=new node(data);
        if(head==null)
        {
            head=nn;
            tail=nn;
        }
        else{
            node temp=nn;
            tail.next=temp;
            temp.prev=tail;
            tail=temp;            
        }
    }
    void deleteNode()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        else{
            head=head.next;
            head.prev=null;
        }
    }
    void display()
    {
        node temp=head;
        System.out.printf("after deleteing fisrt node:\n");
        while(temp!=null)
        {
            if(temp.data==-1) break;
            System.out.printf("%d ",temp.data);
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
       delete_begin dl=new delete_begin();
        int val=0;
        while(val!=-1)
        {
            val=ob.nextInt();
            dl.insert(val);
        }
        dl.deleteNode();
        dl.display();
    }
}
