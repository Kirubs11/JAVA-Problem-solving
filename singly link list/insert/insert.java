import java.util.*;
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class insert {
    Node head;

    public insert() {
        head = null;
    }

    
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }


    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void insertAtMiddle(int data, int position) {
        Node newNode = new Node(data);
        if (position == 0) {
            insertAtBeginning(data);
            return;
        }

        Node temp = head;
        for (int i = 1; i < position && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("The previous node is null.");
        } else {
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insert list = new insert();
        // Scanner ob=new Scanner(System.in);
        // int n=ob.nextInt();
        // int[] arr=  new int[n];
        // for(int i=0; i<=n; i++) {
        //     arr[i]=ob.nextInt();
        // }


        list.insertAtBeginning(10);
        list.insertAtBeginning(20);
        list.display();

        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.display(); 

        list.insertAtMiddle(25, 2);
        list.insertAtMiddle(15, 1);
        list.display(); 
    }
}