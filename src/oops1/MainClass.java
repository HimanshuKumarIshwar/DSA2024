package oops1;

public class MainClass {
    public static void main(String[] args) {
//        Dog d1 = new Dog();
//        d1.name = "Stark";
//
//        d1.age = 2;
//        System.out.println(d1.name);
//        d1.walk();
//        d1.bark();
//
//        Dog d2 = new Dog();
//        d2.name = "tommy";
//        d2.bark();
//        d2.walk();



        Complex c1 = new Complex();
        c1.a = 12;
        c1.b = 123;
        c1.print();


    }
}

   class Complex{
    int a;
    int b;
    void print(){
        System.out.println(a + " + "+ b +"i");
    }

   }

     class Dog{
      String name;
      int age;
      String color;
      void walk(){
          System.out.println( this.name +" is walking");
      }

      void bark(){
          System.out.println( name+ " is Barking");
      }



}
class Cat{



        }