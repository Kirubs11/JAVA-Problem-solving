import java.util.Scanner;

public class sort {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
            next = null;
        }
    }

    sort() {
        head = null;
    }

    public void insertend(int val) {
        Node newnode = new Node(val);

        if (head == null) {
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }

    public void sorting() {
        Node current, index;
        int temp;

        for (current = head; current != null; current = current.next) {
            for (index = current.next; index != null; index = index.next) {
                if (current.data > index.data) {
                    temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
            }
        }
    }

    public void duplicate() {
        Node current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        sort list = new sort();

        System.out.printf("Enter the No of elements in Linkedlist:");

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            list.insertend(val);
        }
        System.out.printf("Before Sorting:\n");
        list.display();
        System.err.println();
        System.out.printf("After Sorting:\n");
        list.sorting();
        list.display();
        System.err.println();

        System.out.printf("Before Remove Duplicate:\n");
        list.display();
        System.err.println();

        System.out.printf("After Remove Duplicate:\n");
        list.duplicate();
        list.display();

        sc.close();
    }
}