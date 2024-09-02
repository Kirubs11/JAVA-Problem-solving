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
   
   void deleteend()
   {
    Node temp=last;
    while(temp.next!=last)
    {
        temp=temp.next;
    }
    temp.next=last.next;
    last=temp;
   }

   void delpos(int pos)
   {
    if(pos==0)
    {
        deletebegin();
        return;
    }
    else{
        Node temp=head;
        for(int i=0;i<pos-1;i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
    }
   }
   void delelem(int el)
   {
        Node temp=head;
        while(temp.next.data!=el)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
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
class Singly_Circular_deletion{
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
        System.out.println("after delete last node : ");
        list.deleteend();
        list.display();
        System.out.printf("enter the element to delete : ");
        int el=ob.nextInt();
        list.delelem(el);
        list.display();
        System.out.printf("enter the position to delete : ");
        int pos=ob.nextInt();
        list.delpos(pos);
        System.out.println("after deleting node at position : ");
        list.display();


}
}
