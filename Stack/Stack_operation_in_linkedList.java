import java.util.*;
class node
{
    int data;
    node next;

    node (int data)
    {
        this.data = data;
        next = null;
    }
}
class stack
{
    node top;

    stack()
    {
        top = null;
    }

    void push(int data)
    {
        node nn=new node(data);
        if(top == null)
        {
            top = nn;
        }
        else{
            node temp=top;
            while(temp.next!= null)
            {
                temp=temp.next;
            }
            temp.next=nn;
        }
    }

    void pop()
    {
        if(top==null)
        {
            System.out.println("Stack is empty");
            return;
        }
        node temp=top;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }
    void peak()
    {
        node temp=top;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        System.out.println(temp.data);

    }
    void display()
    {
        node temp = top;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
class Stack_operation_in_linkedList
{
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        stack s=new stack();
        int val=0;
        while(val!=-1)
        {
            val=ob.nextInt();
            if(val==-1)break;
            s.push(val);
        }
        System.out.println("Stack elements :");
        s.display();
        System.out.println("\nStack elements after poping");
        s.pop();
        s.display();
        System.out.println("\nthe peak or top element is :");
        s.peak();
    }
}
