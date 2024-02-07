package introductionToJava3;

public class LearnCondition {
    public static void main(String[] args) {

//        int age = 18;
//        if(age >= 18) {
//            System.out.println("You can Vote");
//        } else {
//            System.out.println("You can't  Vote");
//        }
//
//        System.out.println("Good Morning");



//        int day = 10;
//        if(day == 1){
//            System.out.println("Go to Home");
//        } else {
//            System.out.println("Go to Office");
//        }



//        int day = 3;
//        if(day == 1){
//            System.out.println("Go To HOme");
//        } else if(day == 2){
//            System.out.println("Go to Village");
//        } else if(day == 3){
//            System.out.println("Go to Party");
//        } else {
//            System.out.println("Got To Office");
//        }
//
//        System.out.println("hello world");


        // you are given three Number find largest Number

        int a = 400;
        int b  = 50;
        int c = 10;

        if(a > b){
             if(a > c){
                 System.out.println("Greater Number is " + a);
             }else {
                 System.out.println("greater Number is " + c);
             }
        }else {
           if(b >  c){
               System.out.println("Greater Number is "+ b);
           }else {
               System.out.println("greater Number is "+ c);
           }
        }



//        int d = 20;
//        int g = 200;
//        int max = 0;
//
//        max  = (d>g)? d:g;
//        System.out.println(max);


        // maxOfTheThreeNumbers

        int firstNumber = 100;
        int secondNumber = 30;
        int thirdNumber = 5000;
        int max = 0;


        max = (firstNumber > secondNumber) ? (firstNumber > thirdNumber)? firstNumber: thirdNumber : (secondNumber > thirdNumber)? secondNumber:thirdNumber;

        System.out.println(max);

// switch statement

        int temp = 34;

//        switch (temp) {
//            case 1 -> System.out.println("case 1");
//            case 2 -> System.out.println("case 2");
//            case 3, 4 -> System.out.println("case 3 and case 4");
//            default -> System.out.println("Nothing to match");
//        }



        // logical operator

        int  time= 12;

//      if(time >= 10){
//          if (time <=20){
//              System.out.println("office is open");
//          }else {
//              System.out.println("office is close");
//          }
//      }else {
//          System.out.println("office is close");
//      }


        if(time >=10 && time <=20){
            System.out.println("office is open");
        } else {
            System.out.println("office is close");
        }


        if(time ==12 || time==18){
            System.out.println("Time for snacks");
        }












    }
}
