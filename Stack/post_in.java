import java.util.*;
class post_in
{
    public static boolean isOperator(char c)
    {
        return c=='+' || c=='-'|| c=='*' || c=='/' || c=='^';
    }

    public static String post(String a)
    {
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < a.length(); i++)
        {
            char c=a.charAt(i);
        
        if(Character.isLetterOrDigit(c))
        {
            stack.push(Character.toString(c));
        }
        else if(isOperator(c))
        {
            String op2=stack.pop();
            String op1=stack.pop();
            String ans="(" + op1 + c + op2 + ")";
            stack.push(ans);
        }
    }
        return stack.pop();
    }
    public static void main(String[] args)
    {
        String a="ABCD-+EF/*";
        System.out.println("Postfix expression: " + a);
        String res=post(a);
        System.out.println("Infix expression: " + res);
    }
}