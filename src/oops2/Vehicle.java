package oops2;

public class Vehicle {
  static  final int gears = 10;
    public static void main(String[] args) {
          Vehicle count = new Vehicle();

        System.out.println(Vehicle.gears);
    }
    int wheelCount;
    String model;
    void start(){
        System.out.println("vehicle is starting");
    }

    Vehicle(){
        System.out.println("creating a Vehicle Instance");
    }
    Vehicle(int wheelCount){
        this.wheelCount = wheelCount;
        System.out.println("Creating vehicle with wheels");
    }




}
