import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyCircular{
    Node head;
    Node last;

    SinglyCircular() {
        head = null;
        last = null;
    }

    void insertend(int data) {
        Node nn = new Node(data);
        if (head == null) {
            head = nn;
            last = nn;
        } else {
            nn.next = head;
            last.next = nn;
            last = nn;
        }
    }

   void deletebegin(){
    last.next=head.next;
    head=head.next;
   }
   void display()
   {
    Node temp=head;
    do{
        System.out.print(temp.data+" ");
        temp=temp.next;
    }while(temp!=head);
    System.out.println();
   }

}
class deletion_At_Begin{
    public static void main(String args[]){
        SinglyCircular list=new SinglyCircular();
        Scanner ob=new Scanner(System.in);
        int val=0;
        while(val!=-1)
        {
            val=ob.nextInt();
            if(val==-1)break;
            list.insertend(val);
        }
        System.out.println("after delete begining node : ");
        list.deletebegin();
        list.display();
    }
}