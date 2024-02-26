package collectionFramework4;
import java.sql.SQLOutput;
import java.util.*;
public class LearnSet {

    enum Color {
        RED, YELLOW, GREEN
    }
    public static void main(String[] args) {
        // random order
        //Set<Integer> set = new HashSet<>();

        //order form element
       // Set<Integer> set = new LinkedHashSet<>();

        //sorted form
//        Set<Integer> set = new TreeSet<>();
//
//        set.add(10);
//
//        set.add(20);
//        set.add(300);
//        set.add(40);
//        set.add(50);
//        System.out.println(set);
//        System.out.println(set.contains(20));



//
//        Set<String> set = new HashSet<>();
//        set.add("Himanshu");
//        set.add("Ram");
//        set.add("Rahul");
//        set.add("Himanshu");
//
//


        //custom class
//        Set<Student> set = new HashSet<>();
//
//        Student s1 = new Student(1, "Himanshu");
//
//        Student s2 = new Student(2,"Ram");
//        set.add(s1);
//        set.add(s2);
//
//
//
//        set.add(new Student(1, "Himanshu"));
//        set.add(new Student(1, "Himanshu"));
//        set.add(new Student(1, "Himanshu"));
//        System.out.println(set);



        //enumset

        //System.out.println(Color.GREEN);

        EnumSet<Color> enumSet = EnumSet.allOf(Color.class);
        System.out.println(enumSet);








    }
}

class Student{
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
       if (this == o) return true;
       if (!(o instanceof Student student)) return false;
       return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNo);
    }
}
