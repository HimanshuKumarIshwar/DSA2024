package collectionFramework2;

import java.util.ArrayList;

public class LearnGenerics {
    public static void main(String[] args) {
//       Dog d1 = new Dog("1234");
//       Dog d2 = new Dog("111");


        Dog<String, String> d3 = new Dog<>("12334", "Tom");

        System.out.println("Dog ka id "+ d3.id +" Dog ka name "+ d3.name);

        Dog<Integer, String> d4 = new Dog<>(123456, "Himanshu");
        System.out.println("Dog ka id "+ d4.id +" Dog ka name "+ d4.name);
        System.out.println(d3.getId());


        ArrayList<Integer> list  = new ArrayList<>();

    }
}

class Dog<E, V>{
    E id;
    V name;
    public Dog(E id, V name){
        this.id = id;
        this.name = name;
    }


    E getId(){
        return id;
    }
}
