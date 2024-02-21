package oops4;

public class LearnInnerClass {
     class Toy {
        int price;

    }

 static   class Playstation{
         int price;
    }


    public static void main(String[] args) {

         //this is inner class whithout static so

         LearnInnerClass obj = new LearnInnerClass();
           Toy toy = obj.new Toy();
           toy.price = 12;


// this is static class or nested class

     Playstation pl = new LearnInnerClass.Playstation();





    }

}
