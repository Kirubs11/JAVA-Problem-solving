import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularSinglyLinkedList {
    Node head;
    Node last;

    CircularSinglyLinkedList() {
        head = null;
        last = null;
    }

    void insert(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            last = nn;
            last.next = head;
        } else {
            nn.next = head;
            last.next = nn;
            last = nn;
        }
    }

    void delete(int ele) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        Node prev = null;

        if (head.data == ele) {
            if (head == last) {
                head = null;
                last = null;
            } else {
                head = head.next;
                last.next = head;
            }
            return;
        }

        do {
            prev = temp;
            temp = temp.next;
        } while (temp != head && temp.data != ele);

        if (temp.data == ele) {
            prev.next = temp.next;
            if (temp == last) {
                last = prev;
            }
        }
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.printf("%d ", temp.data);
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}

public class Search_and_delete {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        CircularSinglyLinkedList s = new CircularSinglyLinkedList();
        int val;
        
        System.out.println("Enter elements to insert into the list (enter -1 to stop):");
        while (true) {
            val = ob.nextInt();
            if (val == -1) break;
            s.insert(val);
        }

        System.out.println("Enter the element to delete:");
        int ele = ob.nextInt();
        s.delete(ele);

        System.out.println("List after deletion:");
        s.display();
    }
}
