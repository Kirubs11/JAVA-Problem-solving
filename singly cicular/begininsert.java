import java.util.*;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}
class sc{
    node head;
    sc() {
        head = null;
    }
    void insert(int data) {
        node nn = new node(data);
        if (head == null) {
            nn.next=nn;
            head = nn;
        } else {
            node temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            temp.next=nn;
            nn.next=head;
            head=nn;
        }
    }
    void display() 
    {
        node temp = head;
        do
        {
            System.out.printf("%d ",temp.data);
            temp = temp.next;
        }while(temp != head);
    }
}
class begininsert 
{
    public static void main(String [] args)
    {
        Scanner ob=new Scanner(System.in);
        sc s=new sc();
        int val=0;
        while(val!=-1)
        {
            val=ob.nextInt();
            if(val==-1)break;
            s.insert(val);
        }
        s.display();
    }
}