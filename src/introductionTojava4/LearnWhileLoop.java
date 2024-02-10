package introductionTojava4;

import java.util.Scanner;

public class LearnWhileLoop {
    public static void main(String[] args) {

//
//Scanner sc = new Scanner(System.in);
//  boolean hasLlearn = false;
//  while(!hasLlearn){
//      System.out.println("Went to school, tried to Learn");
//      System.out.println("have you understood");
//      hasLlearn = sc.nextBoolean();
//  }
//
//        System.out.println("Good Go ahead and Implements in your life for Better");



        //  do while loop
//
//        int i=1;
//        do{
//            i++;
//            System.out.println("'Do while loop");
//        }while(i <= 10);

  // break and continue key word

//        for (int j = 0; j < 10; j++) {
//            if(j==5)break;
//            System.out.println(j);
//        }

//        for (int i = 0; i < 11; i++) {
//            if(i == 3)continue;
//            System.out.println(i);
//        }

//        for(int i = 0; i <= 20; i++){
//            if(i == 2 || i ==8)continue;
//            if(i >= 15)break;
//            System.out.println("gave toffee to "+ i);
//        }




        // nested Loop

//        for(int i = 1; i <= 10; i++ ){
//            for(int j = 1; j <= 10; j++){
//                System.out.print(j+" ");
//            }
//            System.out.println();
//
//        }

        for(int i =0; i <=5; i++){
            for(int j = 0; j <= i; j++){
                System.out.print('*'+" ");
            }
            System.out.println();
        }

        //lebel:
        level:
        for(int i =0; i <= 10; i++){
            int  j = 0;
             while(j <= i){
                 System.out.print(i+" ");
                 j++;
                 if(j == 6)break level;
             }
            System.out.println();
        }


    }
}
