package stack4;

import java.util.ArrayDeque;

public class MainClass {
    public static void main(String[] args) {
   String expression = "a + b - d * ( e + f ) * g";
        System.out.println(infixToPostFox(expression));
    }
  public static String  infixToPostFox(String str){

        String []tokens = str.split(" ");
      ArrayDeque<String> stack = new ArrayDeque<>();
      StringBuilder sb = new StringBuilder();

      for(String token: tokens){
          if(token.equals("(")){
              stack.push(token);
          }else if(token.equals(")")){
              while(!stack.isEmpty() && !stack.peek().equals("(")){
                  sb.append(stack.pop()).append(" ");
              }
              stack.pop();
          }else if(isOperator(token)){
              while(!stack.isEmpty() && precendence(stack.peek()) >= precendence(token)){
                  sb.append(stack.pop()).append(" ");
              }
              stack.push(token);
          }else {
              sb.append(token).append(" ");
          }
      }
      while(!stack.isEmpty()){
          sb.append(stack.pop()).append(" ");
      }



    return sb.toString();

  }
  static int precendence(String str){
        switch(str){
            case"^":
                return 3;
            case"/":
            case"*":
                return 2;
            case"+":
            case"-":
                return 1;
            default:
                return  -1;
        }
  }

  static boolean isOperator(String op){
         return op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("^");
  }
}
