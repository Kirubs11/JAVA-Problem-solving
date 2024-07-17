import java.util.*;
class Node{
    int data;
    Node next;
    Node pre;

    Node(int data){
        this.data = data;
        this.next = null;
        this.pre = null;
    }
}
public class doublelink{
    Node head;
    Node tail;
    
    doublelink(){
        head = null;
        tail = null;
    }
    
    void insertAtEnd(int data)
    {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.pre = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            if(temp.data != -1){
            System.out.print(temp.data+" ");
            temp=temp.next;
            }
        }
    }
    public static void main(String[] args)
    {
        doublelink dll = new doublelink();
        Scanner  ob=new Scanner(System.in);
        int val=0;
        while(val!=-1)
        {
            // System.out.println("E);
            val=ob.nextInt();
            dll.insertAtEnd(val);
        }
        dll.display();
    }
}