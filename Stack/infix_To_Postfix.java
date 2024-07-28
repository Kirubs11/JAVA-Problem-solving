import java.util.*;
class infix_To_Postfix
{
    public static int precedence(char operator){
        switch(operator){
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
    public static boolean check(char op1,char op2){
        return precedence(op1)  >=  precedence(op2);
    }
    public static String InfixtoPost(String n){
        StringBuilder postfix = new StringBuilder();
        
        Stack<Character> stack = new Stack<>();
        
        for(int i =0;i<n.length();i++){
            char c = n.charAt(i);
        
        
            if (Character.isLetterOrDigit(c)){
                postfix.append(c);
            }
            else if(c =='('){
                stack.push(c);
            }
            else if(c ==  ')'){
                while(!stack.isEmpty() && stack.peek() != '('){
                    postfix.append(stack.pop());
                }
                stack.pop();
            }
            else {
                while(!stack.isEmpty() && stack.peek() != '(' && check(stack.peek(),c)){
                    postfix.append(stack.pop());
                }
                stack.push(c);
            }
        }
            
        while(!stack.isEmpty()){
            postfix.append(stack.pop());
        }
        return postfix.toString();
    }
    
    public static void main(String [] args){
        String n = "A+B(C-D)/E*F";
        
        String result= InfixtoPost(n);
        System.out.println(result);
    }
}