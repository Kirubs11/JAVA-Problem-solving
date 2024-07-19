import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class SinglyCircular{
    Node head;
    SinglyCircular() {
        head = null;
    }
    void insertend(int data) {
        Node nn = new Node(data);
        if (head == null) {
            nn.next=nn;
            head = nn;
        } else {
            Node temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            temp.next=nn;
            nn.next=head;
        }
    }
    void display() 
    {
        Node temp = head;
        do
        {
            System.out.printf("%d ",temp.data);
            temp = temp.next;
        }while(temp != head);
    }
}
class endinsert 
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
            s.insertend(val);
        }
        s.display();
    }
}