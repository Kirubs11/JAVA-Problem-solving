import java.util.*;

class node
{
    int data;
    int pri;
    node next;

    node(int data,int pri)
    {
        this.data = data;
        this.pri = pri;
        this.next = null;
    }
}
class Priorit_Dequeue {

    node head;

    Priorit_Dequeue()
    {
        head = null;
    }

    void Enqueue(int data,int pri)
    {
        node nn = new node(data, pri);
        if(head==null)
        {
            head = nn;
        }

        else{
            if(head.pri>pri)
            {
                nn.next = head;
                head = nn;
            }
            else{
                node temp = head;
                while(temp.next!=null && temp.next.pri<=pri)
                {
                    temp = temp.next;
                }
                nn.next = temp.next;
                temp.next = nn;
            }
        }
    }

    void Dequeue()
    {
        head=head.next;
    }

    void display()
    {
        node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+ "--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        Priorit_Dequeue pe = new Priorit_Dequeue();
        int val=0,pr=0;
        System.out.println("Enter the elements of the queue : ");
        while(val!=-1)
        {
            val=ob.nextInt();
            if(val==-1)break;
            pr=ob.nextInt();
            pe.Enqueue(val, pr);
        }
        System.out.println("Priority Queue : ");
        pe.display();
        System.out.println("Enter the number of elements to Delete : ");
        int n=ob.nextInt();
        for(int i=0;i<n;i++)
        {
            pe.Dequeue();
        }
        System.out.println("After deleting elements : ");
        pe.display();
    }
}

