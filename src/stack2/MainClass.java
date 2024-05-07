package stack2;

import java.util.ArrayDeque;

public class MainClass {
    public static void main(String [] args){
//        int []a = {100, 80, 60, 70, 60, 75, 85};
//        int [] ans = stockSpan(a);
//        for(int e: ans){
//            System.out.print(e+" ");
//        }
        String s = "([{()}]){}()";
        System.out.println(parenthesisMatching(s));

    }
    static boolean parenthesisMatching(String s){
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int  i = 0; i < s.length(); i++){
            char cur = s.charAt(i);
            if(cur == '(' || cur == '[' || cur == '{'){
                stack.push(s.charAt(i));

            }else if(!stack.isEmpty()) {

                if(cur == ')' && stack.peek() == '(' || cur == ']' && stack.peek() == '[' || cur == '}' && stack.peek() == '{'){
                    stack.pop();
                }else {
                    return false;
                }


            }else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    static int[] stockSpan(int []a){
        int n = a.length;
        if(n<0)return new int[0];
        int []ans = new int[n];
        ans[0] = 1;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(0);
        for(int i = 1; i < n; i++){
            while(!stack.isEmpty()){

                if(a[stack.peek()] > a[i]){
                    break;
                }
                else {
                    stack.pop();
                }
            }
            if(stack.isEmpty()){
                ans[i] = i+1;
            }else {
                ans[i] = i-stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }
}

