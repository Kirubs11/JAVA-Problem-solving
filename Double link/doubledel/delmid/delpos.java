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
class delpos
{
    node head;
    node tail;
    delpos()
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
    void deleteNodeAtBeg()
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
    void deleteNodeAtPos(int key)
    {
        int count=1;
        node temp=head;
        if(key==0)
        {
            deleteNodeAtBeg();
            return;
        }
        else{
            while(count<key){
                temp=temp.next;
                count++;
            }
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
        }
    }
    void display()
    {
        node temp=head;
        System.out.printf("after deleteing node:\n");
        while(temp!=null)
        {
            System.out.printf("%d ",temp.data);
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        delpos dl=new delpos();
        System.out.print("Enter the number of nodes :" );
        int val= ob.nextInt();
        for(int i=0;i<val;i++)
        {
            int n=ob.nextInt();
            dl.insert(n);
        }
        System.out.print("enter the position: ");
        int key=ob.nextInt();
        dl.deleteNodeAtPos(key);
        dl.display();
    }
}