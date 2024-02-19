package oops2;

public class Car extends Vehicle{


    String color;

    public static void main(String[] args) {
        Car obj = new Car();
        obj.wheelCount = 4;
        obj.model = "i10";
        obj.color = "Black";
        obj.start();
        System.out.println(obj.wheelCount);


    }
    void start(){
  Scooter obj = new Scooter();
  obj.breaking(this);
        super.start();
        System.out.println(this);

        System.out.println(this.model+ " Car is Starting");
    }

    Car(){
        super(3);
        System.out.println("car is Being Created");

    }
}


class Scooter{
    void breaking(Car car){
        System.out.println(car.model +" is breaking");
    }
}

