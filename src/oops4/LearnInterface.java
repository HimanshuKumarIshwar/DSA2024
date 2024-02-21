package oops4;

public class LearnInterface {
    public static void main(String[] args) {
Monkey monkey = new Monkey();
monkey.eats();
    }
}

interface  Animal{

      int leg = 4;
     void eats();
   void drinks();


   default void walk(){
       System.out.println("Animal is walking");
   }
}

interface Pet {
    void walk();
    void drinks();
}

class Monkey implements Animal, Pet{
    @Override
  public  void eats(){
        System.out.println("Monkey is eating");
    }

    @Override
    public  void walk() {
        System.out.println("Monkey is walking");
    }
    public void drinks(){
        System.out.println("Monkey is drinking");
    }
}


