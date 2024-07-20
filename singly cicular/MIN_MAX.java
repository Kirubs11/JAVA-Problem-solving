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

    void minmax()
    {
        Node temp = head;
        int min=10000,max=-1;
        do
        {
            if(temp.data<min) min=temp.data;
            if(temp.data>max) max=temp.data;
            temp=temp.next;
        }
        while(temp!=head);
        System.out.println("The max node in the list is " + max);
        System.out.println("The min node in the list is " + min);

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
class MIN_MAX
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
        list.minmax();
    }
}