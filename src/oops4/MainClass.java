package oops4;

public class MainClass {

    public static void main(String[] args) {
   Car c1 = new Car();
   c1.accelerated();
        System.out.println(c1.breaking(12));
        c1.honks();
    }
}


 abstract class Human{
    void speak(){

    }
    abstract void eat();
}

 abstract class Vehicle {

    abstract void accelerated();
    abstract int breaking(int wheels);

    void honks(){
        System.out.println("Vehicle honks");
    }


}

class Car extends Vehicle{
    @Override
    void accelerated(){
        System.out.println("Car is accelerating");
    }
    @Override
    int  breaking(int wheels){
return wheels;
    }

}




