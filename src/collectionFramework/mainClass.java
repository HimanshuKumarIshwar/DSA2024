package collectionFramework;

public class mainClass {

    public static void main(String[] args) {
       int a[] = new int[3];


        System.out.println("Hello guys");
//        try{
//            int result = 5/0;
//           System.out.println(a[5]);
//
//
//        }catch (ArrayIndexOutOfBoundsException e ){
//            System.out.println("Try to excess out the bound Element");
//        }
//        catch(ArithmeticException e){
//            System.out.println(e.getMessage());
//            System.out.println(e);
//        }

//        try{
//            int result = 4/0;
//            System.out.println(a[11]);
//        }catch(ArrayIndexOutOfBoundsException | ArithmeticException | NullPointerException e){
//            System.out.println("Exception Handling");
//        }




        try{
            int result = 4/0;
            System.out.println(a[11]);
        }catch(Exception e){
            System.out.println(" All Exception Handling");
        }














        System.out.println("By Guys");





    }



}
