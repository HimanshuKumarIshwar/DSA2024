package collectionFramework5;

public class Animal implements Comparable<Animal> {
    int age;
    String name;
    int wt;


    public Animal(int age, String name, int wt) {
        this.age = age;
        this.name = name;
        this.wt = wt;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", wt=" + wt +
                '}'+"\n";
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWt() {
        return wt;
    }

    @Override
    public int compareTo(Animal that) {
      if(this.age == that.age){
          return this.name.compareTo(that.name);
      }
        return this.age-that.age;
    }
}
