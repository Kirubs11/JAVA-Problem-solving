import java.util.Scanner;
public class Deletion
{
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
 Deletion()
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
   while(temp.next!=null)
   {
    temp=temp.next;
   } 
   temp.next=newnode;
  }
 }
 public void deletebegin()
 {
   head = head.next; 
 }
 public void deletepos(int ind)
 {
   Node temp = head;
   Node prev = null;
   for(int i=1;i<ind;i++)
   {
    prev = temp;
    temp = temp.next; 
   } 
   prev.next = temp.next;
 }
 public void deleteend(int n)
 {
   Node temp = head;
   Node prev = null;
   while(temp.next!=null)
   { 
    prev = temp;
    temp = temp.next; 
   }
    prev.next = null;
  }
 public void display()
 {
  Node temp=head;
  while(temp!=null)
  {
   System.out.print(temp.data+"-->");
   temp = temp.next; 
  }  
  System.out.println("NULL");
 }
 
 public static void main(String args[])
 {
  Scanner ob = new Scanner(System.in);
  Deletion list = new Deletion();
  System.out.print("Enter the number of nodes : ");
  int n = ob.nextInt();
  System.out.print("Enter the node :\n ");
  for(int i=0;i<n;i++)
  {
   int val = ob.nextInt();
   list.insertend(val); 
  }
  list.display(); 
  System.out.print("Delete at begin\n");
  list.deletebegin();
  list.display();
  System.out.print("Delete at end\n");
  list.deleteend(n);
  list.display();
  System.out.println("Enter the index to delete: ");
  int ind = ob.nextInt();
  list.deletepos(ind);  
  list.display();
  ob.close();
 }
}