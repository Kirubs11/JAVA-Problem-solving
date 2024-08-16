import java.util.*;
public class stack {
    public static void main(String[] args)
    {
        Scanner ob= new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        System.out.println("Stack Before inserting : "+stack); 
        stack.add(10);
        stack.add(20);
        stack.add(30);
        stack.add(40);
        stack.add(50);
        System.out.println("Stack after inserting : "+stack); 
        stack.pop();
        System.out.println("After pop the element : "+stack);  
        System.out.println("Peek element : "+stack.peek()); 
        if(stack.isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else System.out.println("Stack is not empty");
        System.out.println("After reverse the stack : "+stack.reversed());


    }
}
