package recursion4;

public class MainClass {
    public static void main(String[] args) {
        int a = 2;
        int b = 600;
        //System.out.println(power(a,b));
        //System.out.println(powerWithModulo(2,6,10));
        //System.out.println(matrixPaths(3,3));

        String s = "abbabadba";
        String t = "ba";
        System.out.println(iterativelString(s, t));
    }

    static int power(int a, int b){
        if(b == 0)return 1;
        if(b % 2 == 0)return power(a*a,b/2);
        return power(a,b-1) * a;
    }

    static int powerWithModulo(int a, int b, int m){
        if(b == 0) return 1;
        if(b < 0)return powerWithModulo(1/a, Math.abs(b), m);
        if((b & 1) == 0) return powerWithModulo((a % m *a % m) % m, b/2, m);
        return ((powerWithModulo(a, b-1, m)) % m * a % m ) % m;
    }

    static int matrixPaths(int m, int n){
         if(m == 1 || n == 1) return 1;
         return matrixPaths(m-1, n) + matrixPaths(m, n-1);
    }

    static int iterativelString(String s, String t){
        int count  = 0;
        for(int i = 0; i <= s.length() - t.length(); i++){
            int j = 0;
            for(; j < t.length(); j++){
                 if(s.charAt(i+j) != t.charAt(j))break;
            }
            if(j == t.length())count++;
        }

        return count;
    }
}
