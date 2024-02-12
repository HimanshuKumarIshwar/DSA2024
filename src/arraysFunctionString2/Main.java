package arraysFunctionString2;

public class Main {
    public static void main(String[] args) {
       // System.out.println(twoSum(12,12));
        // greet();
       int avg =  average(4,6, true);

        //System.out.println(avg);
        //System.out.println(Math.min(22, 34));
        int  a  = 12;
        int b = 111;
//        System.out.println(min(a, b));
//        System.out.println((int)Math.floor(Math.random()*(20-10)+1)+10);
        System.out.println(getRandom(11,17));
    }
    static int twoSum(int a, int b){
        return a+b;
    }

    static int min(int a, int b){
        return a > b ? b : a;
    }



    public static  int average(int a, int b, boolean isAverage){
     int average = (a + b) / 2;
        System.out.println("The avg is "+ average);
        return average;
    }


    static  void greet(){
        System.out.println("Hello Good Morning");
    }

    public static int  getRandom(int a, int b){
         return (int)(Math.random() * (b-a+1) + a);
    }
}


