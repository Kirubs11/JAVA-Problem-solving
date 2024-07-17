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
class delend
{
    node head;
    node tail;
    delend()
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
    void deleteNodeAtEnd()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        else{
            tail = tail.prev;
            tail.next = null;
        }
    }
    void display()
    {
        node temp=head;
        System.out.printf("after deleteing last node:\n");
        while(temp!=null)
        {
            System.out.printf("%d ",temp.data);
            temp=temp.next;
        }
    }
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        delend dl=new delend();
        System.out.print("Enter the number of nodes");
        int val= ob.nextInt();
        for(int i=0;i<val;i++)
        {
            int n=ob.nextInt();
            dl.insert(n);
        }
        
        dl.deleteNodeAtEnd();
        dl.display();
    }
}