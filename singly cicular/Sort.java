import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class scl
{
    Node head;
    Node last;

    scl() {
        head = null;
        last = null;
    }

    void insert(int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
            last = newNode;
        } else {
            newNode.next = head;
            last.next = newNode;
            last = newNode;
        }
    }

    void sort()
    {
        Node cur;
        Node in;
        int temp=0;
        for(cur = head; cur.next != head; cur = cur.next) 
        {
            for(in=cur.next; in != head; in = in.next)
            {
                if(cur.data>in.data)
                {
                    temp = cur.data;
                    cur.data = in.data;
                    in.data = temp;
                }
            }
        }

    }
    void display() {
        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while(temp!=head);
        System.out.println();
    }
}
class Sort
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        scl list = new scl();
        int val = 0;
        while(val!=-1)
        {
            val = sc.nextInt();
            if(val==-1) break;
            list.insert(val);
        }
        System.out.println("Before sorting the list : ");
        list.display();
        list.sort();
        System.out.println("Ater sorting the list : ");
        list.display();
    }
}