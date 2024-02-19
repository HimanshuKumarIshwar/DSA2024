package oops1;

public class LearnMethodOverloading {
    public static void main(String[] args) {
    Greet obj = new Greet();
       obj.greet("Himanshu");
       obj.greet();
       obj.greet("Mohan", 10);
    }
}

class Greet{
    void greet(){
        System.out.println("Hello Good Morning");
    }
    void greet(String name){
        System.out.println("Hello "+name + " Good Morning");
    }

    void greet(String name, int count){
        for(int i =0; i<count; i++){
            System.out.println("Hello "+name + " Good Morning");
        }
    }
}
