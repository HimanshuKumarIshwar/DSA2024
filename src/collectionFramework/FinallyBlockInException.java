package collectionFramework;

public class FinallyBlockInException {
    public static void main(String[] args) {
        int a[] = new int[5];
        System.out.println("Hello world");


//        try{
//            System.out.println(a[7]);
//        }catch(Exception e){
//            System.out.println("Exception handle");
//        }  finally {
//            System.out.println("I  will run always");
//        }






//        try{
//            System.out.println(a[7]);
//        } finally {
//            System.out.println("I  will run always");
//        }





        //System.out.println("Bye world");



try{
    getNumberFromArray(a);
}catch (Exception e){
    System.out.println(e.getMessage());
}

    }


    static int getNumberFromArray(int []a)  throws ArithmeticException{
        return a[8];
    }
}
