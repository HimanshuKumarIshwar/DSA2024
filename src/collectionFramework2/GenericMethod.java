package collectionFramework2;

public class GenericMethod {
    public static void main(String[] args) {
        printData("Hello");

        GenericMethod obj = new GenericMethod();
        obj.doubleData("himanshu");
        obj.doubleData(123);

        CustomClass custom  = new CustomClass();
        obj.doubleData(custom);
    }

    static <E> void printData(E data){
        System.out.println(data);
    }



    <E> void doubleData(E data){
        System.out.println(data);

    }

//    <E extends Number> void doubleData(E data){
//        System.out.println(data);
//
//    }


}

class CustomClass{

}
