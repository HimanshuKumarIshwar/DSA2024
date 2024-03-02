package recursion1;

public class MainClass {
    public static void main(String[] args) {
         // fun(4);
        //  fun2(4);

        //bar(3);
        //System.out.println(sumOfNNaturalNumbers(5));
        //System.out.println(fibonacciNumber(2));
        for(int i = 0; i < 10; i++){
            System.out.println(fibonacciNumber(i));
        }
    }



   static  void fun(int n){
        if(n>0){
            System.out.println("Hello world" + n);

            fun(n-1);
        }


    }
    static  void fun2(int n){
        if(n>0){
            fun2(n-1);
            System.out.println("Hello world" + n);
        }

    }

    static void bar(int n){
        if(n > 0){
            System.out.println(n);
            bar(n-1);
            bar(n-1);
        }
    }

    static int sumOfNNaturalNumbers(int n){
        if(n==1)return 1;
        return sumOfNNaturalNumbers(n-1)+n;
    }

    static int fibonacciNumber(int n){
          if(n<=1){
            return n;

        }

       return fibonacciNumber(n-1)+ fibonacciNumber(n-2);

    }


}
