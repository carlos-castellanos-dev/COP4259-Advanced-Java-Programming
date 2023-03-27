
import java.util.*;

public class Calculator {
    private static Scanner s = new Scanner(System.in);
    
    private static int getOp(String exp, int cur){
        Scanner s = new Scanner(exp.substring(cur));
        s.useDelimiter("[^0-9]");
        return s.nextInt();
    }
    public static int doOp(int op1, int op2, char operator) {
        switch(operator) {
        case '+': return op1+op2;
        case '-': return op1-op2;
        case '*': return op1*op2;
        case '/': return op1/op2;
        default:
            return 0;
        }
    }
    public static int comparePrecedence(char op1, char op2) {
        if(op1 == '+' || op1 == '-')
            if(op2 == '+' || op2 == '-')
                return 0;
            else
                return -1;
        else if(op2 == '+' || op2 == '-')
            return 1;
        else
            return 0;    
    }
    public static void main(String args[]) throws Exception{
      Stack<Character> operators = new Stack<Character>();
      Stack<Integer> operands = new Stack<Integer>();
      while(true){
          System.out.println("Please enter a new expression: ");
          String exp = s.nextLine();
          if(exp.equals("DONE"))
            break;
          for(int cur = 0; cur < exp.length();cur++){
              switch(exp.charAt(cur)) {
              case '+':case '-':case'*':case'/':
                  while(!operators.isEmpty() && operators.peek() != '(' && operators.peek() != '{' && operators.peek() != '[') 
                      if(comparePrecedence(operators.peek(), exp.charAt(cur)) >= 0) {
                          int temp = operands.pop();
                          operands.push(doOp(operands.pop(), temp, operators.pop()));
                      }else break;
                  operators.push(exp.charAt(cur));
                  break;
              case '(':
                  operators.push(exp.charAt(cur));
                  break;
              case ')':
                  if(operators.peek()!= '('){
                      int temp = operands.pop();
                      operands.push(doOp(operands.pop(), temp, operators.pop()));
                  }
                  operators.pop();//pop the matching open parenthesis
                  break;
              case '[':
                  operators.push(exp.charAt(cur));
                  break;
              case ']':
                  if(operators.peek()!= '['){
                      int temp = operands.pop();
                      operands.push(doOp(operands.pop(), temp, operators.pop()));
                  }
                  operators.pop();//pop the matching open parenthesis
                  break;
              case '{':
                  operators.push(exp.charAt(cur));
                  break;
              case '}':
                  if(operators.peek()!= '{'){
                      int temp = operands.pop();
                      operands.push(doOp(operands.pop(), temp, operators.pop()));
                  }
                  operators.pop();//pop the matching open parenthesis
                  break;
              case ' ': case '\t': break;
              default://if number
                  if (Character.isDigit(exp.charAt(cur))){
                      int temp = getOp(exp, cur);
                      while(cur < exp.length() && Character.isDigit(exp.charAt(cur)))
                          cur++;
                      cur--;
                      operands.push(temp);
                  }else
                      throw new Exception("Error: bad input");
              }
          }  
          int result;
          while(!operators.isEmpty()){
              int temp = operands.pop();
              operands.push(doOp(operands.pop(), temp, operators.pop()));
          }
          System.out.println("The result is " + operands.pop());
      }
    }
}