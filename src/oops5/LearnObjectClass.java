package oops5;

import java.util.Objects;

public class LearnObjectClass {

    public static void main(String[] args) {
        Car obj = new Car("Honda", 2022);

        Car obj2 = new Car("Honda", 2022);

       // Car obj3 = obj2;  // this is not a clone





        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());

        System.out.println(obj.equals(obj2));



    }


}

class Car{
    String model;
    int year;
   public Car(String model, int year){
       this.model = model;
       this.year = year;
   }
   @Override
    public String toString(){
        return "Car ka model " + model +" and year is "+year;
    }

//   public int hashCode(){
//       int initialNumber = 31;
//       initialNumber+=year;
//       initialNumber+=model.hashCode();
//       return initialNumber;
//
//   }


    @Override
    public int hashCode() {
        return Objects.hash(model, year);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car car)) return false;
        return year == car.year && Objects.equals(model, car.model);
    }

    //    public boolean equals(Object obj){
//         Car that = (Car) obj;
//
//         if(this.model.equals(that.model)  && this.year == that.year)return true;
//         return false;
//    }
}


