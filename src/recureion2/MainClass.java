package recureion2;

public class MainClass {
    public static void main(String[] args) {
       // System.out.println(ncr(3,1));

        System.out.println(josephus(5, 3));
    }

    static int ncr(int n, int r){
        if(r==0 || n == r )return 1;
        return ncr(n-1, r-1) + ncr(n-1, r);
    }

    static int josephus(int n, int k){
        if(n == 1)return 0;

        return (josephus(n-1, k) + k) % n;
    }
}
