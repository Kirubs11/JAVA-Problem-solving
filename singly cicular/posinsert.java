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
    void insertpos(int pos,int data)
    {
        node nn=new node(data);
        if(pos==0)
        {
            insert(data);
            return;
        }
        else{
            node temp=head;
            for(int i=0;i<pos-1;i++)
            {
                temp=temp.next;
            }
            nn.next=temp.next;
            temp.next=nn;
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
class posinsert 
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
            s.insert(val);
        }
        System.out.println("Enter position to insert : ");
        int pos=ob.nextInt();
        System.out.println("Enter data to insert : ");
        int data=ob.nextInt();
        s.insertpos(pos,data);
        s.display();
    }
}