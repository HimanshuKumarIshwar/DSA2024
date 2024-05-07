package stack3;

import java.util.ArrayDeque;

public class MainClass {
    public static void main(String[] args) {
        String str = "3 4 * 2 5 * +";
        System.out.println(evalutePostFixExpression(str));
        System.out.println(postFix(str));
    }
    static int postFix(String s){
        String []tokens = s.split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for(String token: tokens){
            if(isOperand(token)){
                int second = stack.pop();
                int first = stack.pop();
                int res = 0;
                switch(token){
                    case "+":
                      res = first + second;
                      break;
                    case "-":
                        res = first - second;
                        break;
                    case "*":
                        res = first * second;
                        break;
                    case "/":
                        res  = first / second;
                        break;
                    case "^":
                        res = (int) Math.pow(first, second);
                        break;

                }
                stack.push(res);


            }else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
    static boolean isOperand(String op){
        return op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/") || op.equals("^");
    }
    static int evalutePostFixExpression(String str){
        String token[] = str.split(" ");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int  i  = 0; i < token.length; i++){
           String cur = token[i];
           if(cur.equals("+") || cur.equals("-") || cur.equals("*") || cur.equals("/")){

               int secondOperand = stack.pop();
               int firstOperand = stack.pop();
               int res = 0;
               if(cur.equals("+")){
                   res = firstOperand + secondOperand;

               } else if (cur.equals("-")) {
                   res = firstOperand - secondOperand;
               } else if (cur.equals("*")) {
                   res = firstOperand * secondOperand;
               }else if(cur.equals("/")){
                   res = firstOperand / secondOperand;
               }

               stack.push(res);

           }else {
               stack.push(Integer.parseInt(cur));
           }
        }
        return stack.pop();
    }
}
