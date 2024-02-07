package introductionToJava2;

import java.util.Scanner;

public class LearnScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//
//        int sum = a + b;
//        System.out.println(sum);


        // voting system

        System.out.println("Enter your age: ");
         float age = sc.nextFloat();
        System.out.println("your age is "+ age);
        sc.close();
    }




}
