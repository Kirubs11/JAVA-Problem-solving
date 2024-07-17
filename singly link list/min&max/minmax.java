import java.util.Scanner;

public class minmax {

    Node head;
    class Node
    {
        int data;
        Node next;

        Node(int val)
        {
            data = val;
            next = null;
        }
    }
    minmax()
    {
        head = null;
    }
    public void insertend(int val)
    {
        Node newnode = new Node(val);
        if(head == null)
        {
            head = newnode;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    
    public void reverse()
    {
      Node prev = null;
      Node current = head;
      Node next = current.next;
      while(current!=null)
      {
        next=current.next;
        current.next=prev;
        prev=current;
        current=next;
      }  
      head=prev;
    }
    public void max()
    {
        Node temp = head;
        int b = 0;
        while(b<temp.data)
        {  
          b=temp.data;   
          temp = temp.next;
          if(temp==null){
           break; 
          }
        } 
        System.out.println("The maximum value is :"+b );
    }
    public void min()
    {
        Node temp = head;
        int b = temp.data;
        while(b>=temp.data)
        {  
          b=temp.data;   
          temp = temp.next;
          if(temp==null){
           break; 
          }
        } 
        System.out.println("The minimum value is :"+b );
    }
    public void search(int val2)
    {
        Node temp = head;
        int i=1;
        while(temp != null)
        {
         if(val2==temp.data)
         {
          System.out.println(temp.data+" is found at the index "+i);
          break;  
         }
         else{   
         temp = temp.next;
         i++;
        }
        }
    }
    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data+ "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        minmax list = new minmax();
        System.out.println("Enter the value of n:");
        int n = s.nextInt();
        System.out.println("Enter  values");
        for(int i=0;i<n;i++)
        {
            int val = s.nextInt();
            list.insertend(val);
        }
        list.display();
        
        list.min();
        list.max();
        System.out.println("Enter the value to search :");
        int val2=s.nextInt();
        list.display();
        list.search(val2);

        System.out.print("reversing...\n");
        list.reverse();
        list.display();
        s.close();

    
}
}