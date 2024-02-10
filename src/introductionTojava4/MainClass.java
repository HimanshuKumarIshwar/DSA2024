package introductionTojava4;
import java.util.Scanner;
public class MainClass {

    public static void main(String[] args) {
//        System.out.println("Hello world");
//        System.out.println("Hello world");
//        System.out.println("Hello world");
//        System.out.println("Hello world");
//        System.out.println("Hello world");


        for(int i = 0; i<=10; i++){
            System.out.println("Hello world");
        }
  // Table print;
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n = sc.nextInt();
//        for(int i = 1; i <=10; i++){
//            System.out.println(n + " * " + i +" = " + n*i);
//        }


        // sum of N Natural Number
        int sum  = 0;
//        for(int i = 1; i<=n; i++){
//            sum+=i;
//        }

        sum  = n*(n+1)/2;
        System.out.println(sum);
  int evenSum = 0;

  for(int i=0; i<=n; i+=2){
      evenSum += i;
  }
        System.out.println(evenSum);







    }
}
