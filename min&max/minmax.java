import java.util.*;
class node
{
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
class minmax
{
    node head;
    node tail;

    minmax()
    {
        head=null;
        tail=null;
    }

    void insert(int data)
    {
        node newNode=new node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
    }

    void max()
    {
        node curr=head;
        int max=head.data;
        while(curr!=null)
        {
            if(curr.data>max)
            {
                max=curr.data;
            }
            curr=curr.next;
        }
        System.out.printf("\nmax value in the list is : %d",max);
    }
    void min()
    {
        node curr=head;
        int min=head.data;
        while(curr!=null)
        {
            if(curr.data<min)
            {   
                min=curr.data;
            }
            curr=curr.next;
        }
        System.out.printf("min value in the list is : %d",min);
    }

    void display()
    {
        node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args)
    {
        Scanner ob=new Scanner(System.in);
        minmax mm=new minmax();
        int val=0;
        while(val!=-1)
        {
            val=ob.nextInt();
            if(val==-1)break;
            mm.insert(val);
        }
        mm.min();
        mm.max();
        // mm.display();
        
    }
}
