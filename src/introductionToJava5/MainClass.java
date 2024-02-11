package introductionToJava5;

public class MainClass {
    public static void main(String[] args) {
        //star print 1
//        for(int i = 0; i < 6; i++){
//            for (int j = 0; j < 6; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //start print-2
//        for(int i = 0; i < 6; i++){
//            for(int j =0; j <= i; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
     //loop3
//         for(int i = 1; i <= 6; i++){
//             for(int j = 1; j <= i; j++){
//                 System.out.print(j+" ");
//             }
//             System.out.println();
//         }

        int n = 6;

//   for(int i = 1; i <= n; i++){
//       for(int j = 1; j <= n-i; j++ ){
//           System.out.print("  ");
//       }
//       for(int j = 1; j<=i; j++){
//           System.out.print("* ");
//       }
//       System.out.println();
//   }


//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= n-i; j++){
//                System.out.print("  ");
//            }
//            for(int j = 1; j <= i; j++){
//                System.out.print("* ");
//                System.out.print("  ");
//            }
//            System.out.println();
//        }

      for(int i = 0; i < n; i++){
          for(int j = 0; j < n-i; j++){
              System.out.print("  ");
          }
          System.out.print("* ");
          for(int j = 0; j < (2*i-1) ; j++){
              System.out.print("  ");
          }

          if(i!=0 ){
              System.out.print("* ");
          }

          System.out.println();
      }
        for(int i = n; i >= 0; i--){
            for(int j = 0; j < n-i; j++){
                System.out.print("  ");
            }
            System.out.print("* ");
            for(int j = 0; j < (2*i-1) ; j++){
                System.out.print("  ");
            }
            if(i!=0){
                System.out.print("* ");
            }

            System.out.println();
        }






    }
}
