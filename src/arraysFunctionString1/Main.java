package arraysFunctionString1;

public class Main {
    public static void main(String[] args) {

//        int age = 12;
//        System.out.println(age);

        //Arrays
//        int a[]  = new int[2];
//        a[0] = 12;
//        System.out.println(a[1]);
//
//        int age[];  //declaration
//        age = new int[12]; // allocation
//
//
//        age[0] = 5;
//        age[1] = 2;
//        System.out.println(age[0]);



//        int marks[] = {12,23,44,5,6,7,8};
//        for(int e: marks){
//            System.out.println(e);
//        }





          String names[] = {"Himanshu", "Kumar", "ram", "Shyam"};
//

//        for(int i = 0; i < names.length; i++){
//            System.out.println("Name is " + names[i]);
//        }


//        for(String name: names){
//            System.out.println(name);
//        }


        int [] numbers = {1,2,-40,5,6};

          int sum = 0;
//          for(int num: numbers){
//              sum += num;
//          }
//        System.out.println(sum);


//    for(int i = 0; i <numbers.length; i++){
//        sum += numbers[i];
//    }
//
//        System.out.println(sum);


        int min  = Integer.MAX_VALUE;
        for(int number : numbers){
            if(number < min){
                min = number;
            }
        }

       // System.out.println(min);

//   int max = Integer.MIN_VALUE;
//  for(int i = 0; i < numbers.length; i++){
//    if(numbers[i] > max){
//        max = numbers[i];
//    }
//
//}
//        System.out.println(max);






   int [][] a =  new int[3][4];
   a[0][0]  = 12;
   a[0][1] = 13;
   a[0][2] = 44;
   a[0][3] = 88;

   for(int i = 0; i < a.length; i++){
       for(int j = 0; j < a[i].length; j++){
           System.out.print(a[i][j]+" ");
       }
       System.out.println( );
   }









    }
}
