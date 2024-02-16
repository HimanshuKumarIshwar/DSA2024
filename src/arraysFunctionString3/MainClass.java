package arraysFunctionString3;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
//        String name = "Himanshu";
//        String newName = new String("Himanshu");
//        String sameName = "Himanshu";
//        System.out.println(name);

        //System.out.println(name == sameName);
       // System.out.println(name.equals(sameName));
       // System.out.println(name.charAt(0));

//    Scanner sc = new Scanner(System.in);
//        System.out.println("Enter your First Name");
//          String firstName = sc.nextLine();
//
//        System.out.println("Enter your Second Name");
//        String secondName = sc.nextLine();
//
//
//        System.out.println("Your full Name is : "+firstName.toUpperCase()+" "+ secondName.toUpperCase());
//




        //String name = "     himanshu      ";

        //System.out.println(name.trim());


        //System.out.println("Carpet".startsWith("Carp"));
        //System.out.println("Himanshu".endsWith("shu2"));

        //System.out.println("Carpet".charAt(3));

//        int a = 2;
//        String b = String.valueOf(a);
//        System.out.println(b+2);
//        System.out.println(a*8);

        String sentence = "I love java , java is good language";
//        System.out.println(sentence.replace("java", "CPP"));

        //System.out.println(sentence.contains("java"));

        //System.out.println(sentence.substring(2,11));


        String words[] = sentence.split(" ");

//        for(String s: words){
//            System.out.println(s);
//        }


//        String name = "Ram";
//        char [] chars = name.toCharArray();
//        for(char c: chars){
//            System.out.println(c);
//        }


        String animal ="t";
        if(animal.isEmpty()){
            System.out.println("Empty");
        }




    }
}
