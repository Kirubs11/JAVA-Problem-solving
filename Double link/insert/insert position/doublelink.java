import java.util.*;

class Node {

    int data;
    Node next;
    Node prev;

    public Node(int data) {

        this.data = data;
        this.next = null;
        this.prev = null;
    }

}

public class doublelink {

    Node head;
    Node tail;

    public doublelink() {

        head = null;
        tail = null;
    }

    public void insertAtBegin(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertatposition(int data, int pos) {

        Node newNode = new Node(data);

        if (pos == 0) {

            insertAtBegin(data);
            return;
        }

        Node current = head;

        for (int i = 0; i < pos - 1 && current != null; i++) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("The previous node is null");
            return;
        } else {

            newNode.next = current.next;
            newNode.prev = current;
            current.next = newNode;

            newNode.next.prev = newNode;
        }
    }

    public void display() {

        Node current = head;

        if (head == null) {

            System.out.println("List is empty");
            return;
        }

        System.out.println("Nodes of doubly linked list: ");
        while (current != null) {

            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] args) {

        doublelink dList = new doublelink();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements you want to insert: ");

        int n = sc.nextInt();

        System.out.println("Enter the elements: ");

        for (int i = 0; i < n; i++) {

            int data = sc.nextInt();
            dList.insertAtBegin(data);
        }

        System.out.println("Enter the position where you want to insert the element: ");

        int pos = sc.nextInt();

        System.out.println("Enter the element you want to insert: ");

        int data = sc.nextInt();

        dList.insertatposition(data, pos);

        dList.display();

        sc.close();
    }

}