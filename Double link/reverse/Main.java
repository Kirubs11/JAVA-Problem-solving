import java.util.*;

class Node {
  int data;
  Node next;
  Node prev;

  Node(int data) {
    this.data = data;
    this.next = null;
    this.prev = null;
  }
}

class doubl {
  Node Head;
  Node Tail;

  doubl() {
    Head = null;
    Tail = null;
  }

  public void insert(int data) {
    Node NewNode = new Node(data);
    if (Head == null) {
      Head = NewNode;
      Tail = NewNode;
    } else {
      Tail.next = NewNode;
      NewNode.prev = Tail;
      Tail = NewNode;
    }
  }

  public void reverse() {
    Node temp = Tail;
    while (temp != null) {
      System.out.printf("%d ", temp.data);
      temp = temp.prev;
    }
  }
}

class Main {
  public static void main(String[] args) {
    Scanner ob = new Scanner(System.in);
    doubl db = new doubl();
    int val = 0;
    while (val != -1) {
      val = ob.nextInt();
      if (val == -1)
        break;
      db.insert(val);
    }
    db.reverse();
  }
}