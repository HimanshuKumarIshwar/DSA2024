package backtracking2;

public class GenerateParentheses {
    public static void main(String[] args) {
        int n = 3;
        generateParentheses(n,0, 0, 0,"");
    }
    static void generateParentheses(int n, int open , int close, int i, String cur){
        if(i == 2*n){
            System.out.println(cur);
            return;
        }

        if(open < n){
            cur = cur +'(';
            generateParentheses(n, open+1, close, i+1, cur);
            cur = cur.substring(0, cur.length()-1);
        }

        if(close < open){
            cur = cur + ')';
            generateParentheses(n, open, close+1, i+1, cur);
            cur = cur.substring(0, cur.length()-1);
        }
    }

}
