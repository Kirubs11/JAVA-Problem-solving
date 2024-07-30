import java.util.*;

class infix_To_prefix {

  public static int precedence(char c) // function to return the precedence of the operator
  {
    switch (c) {
      case '+':
      case '-':
        return 1;
      case '*':
      case '/':
        return 2;
      case '^':
        return 3;
    }
    return -1;
  }

  public static boolean check(char op1, char op2) { // check precedence of operators

    return precedence(op1) >= precedence(op2);

  }

  public static String infixToPrefix(String n) {
    Stack<Character> stack = new Stack<>(); // stack to store operators
    String result = ""; // string to store the prefix expression

    for (int i = n.length() - 1; i >= 0; i--) // iterate the infix expression from right to left
    {
      char c = n.charAt(i); // get the character at index i

      if (Character.isLetterOrDigit(c)) // if character is operand
      {
        result = c + result; // add the operand to the prefix expression
      } else if (c == ')') // if character is closing parenthesis
      {
        stack.push(c); // push it to the stack
      } else if (c == '(') // if character is opening parenthesis
      {
        while (!stack.isEmpty() && stack.peek() != ')') // pop the operators from the stack until closing parenthesis is
                                                        // encountered
        {
          result = stack.pop() + result; // add the operator to the prefix expression
        }
        stack.pop(); // pop the closing parenthesis
      } else // if character is operator
      {
        while (!stack.isEmpty() && precedence(c) < precedence(stack.peek())) // pop the operators from the stack until
                                                                              // the precedence of the current operator
                                                                              // is less than the precedence of the
                                                                              // operator at the top of the stack
        {
          result = stack.pop() + result; // add the operator to the prefix expression
        }
        stack.push(c); // push the operator to the stack
      }
    }

    while (!stack.isEmpty()) // pop the remaining operators from the stack
    {
      result = stack.pop() + result; // add the operator to the prefix expression
    }

    return result; // return the prefix expression
  }

  public static void main(String[] args) 
  {

      Scanner sc = new Scanner(System.in); // create a scanner object for input

      System.out.println("Enter the infix expression: "); // prompt the user to enter the infix expression

      String n = sc.next(); // read the infix expression

      String result = infixToPrefix(n); // call the function to convert infix to prefix

      System.out.println("Prefix expression: " + result); // print the prefix expression

      sc.close();
  }
}