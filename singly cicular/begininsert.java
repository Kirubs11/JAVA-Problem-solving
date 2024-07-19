import java.util.*;

class node {
    int data;
    node next;

    node(int data) {
        this.data = data;
        this.next = null;
    }
}
class SinglyCircular{
    node head;
    SinglyCircular() {
        head = null;
    }
    void insertbeg(int data) {
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
        SinglyCircular s=new SinglyCircular();
        int val=0;
        while(val!=-1)
        {
            val=ob.nextInt();
            if(val==-1)break;
            s.insertbeg(val);
        }
        s.display();
    }
}