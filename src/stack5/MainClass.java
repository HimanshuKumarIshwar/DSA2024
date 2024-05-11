package stack5;

import java.util.ArrayDeque;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        //int[] a = {1, 6, 4, 10, 2, 5};
        //int [] ans = prevSmallestElem(a);
        //int []ans = nextSmallerElem(a);


        int []a = {1, 4, 3, 2, 7,9,6,4};
        int []ans = maxInMin(a);


        for(int e: ans){
            System.out.print(e+" ");
        }

    }

    static int[] maxInMin(int []a){
        int n = a.length;
        int []leftMin = prevSmallestElem(a);
        int []rightMIn = nextSmallerElem(a);

        int []ans  = new int[n];
        Arrays.fill(ans, Integer.MIN_VALUE);
        for(int i = 0; i < n; i++){
            int windowSize = rightMIn[i]-leftMin[i]-1;
           ans[windowSize-1] = Math.max(ans[windowSize-1], a[i]);

        }

        for(int i = n-2; i>=0; i--){
           ans[i] = Math.max(ans[i], ans[i+1]);
        }
return ans;
    }
    static int[] nextSmallerElem(int []a){
        int n = a.length;
        if(n < 1) return null;
        int [] ans = new int[n];
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        stack.push(n-1);
        ans[n-1] = n;
        for(int i = n-2; i>=0; i--){
            while(!stack.isEmpty() && a[stack.peek()] >= a[i] ){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = n;
            }else {
                ans[i] = stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }

    static int[] prevSmallestElem(int []a){
        int n = a.length;
        if(n <  1)return null;
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int []ans = new int[n];
        ans[0] = -1;
        stack.push(0);
        for(int i = 1; i < n; i++){
            while(!stack.isEmpty() && a[stack.peek()] >= a[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
            }else {
                ans[i] = stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }
}
