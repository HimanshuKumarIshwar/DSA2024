package collectionFramework3;

import java.util.*;


public class ListIterator {
    public static void main(String[] args) {

//        List<String> list  = new ArrayList<>();
//
//        list.add("Kiwi");
//        list.add("papaya");
//        list.add("Mango");
//        list.add("Apple");

//        for(int i = 0; i <list.size(); i++){
//            System.out.println(list.get(i));
//        }


//        for (String s : list) {
//            System.out.println(s);
//        }




        // using Iterator

//        Iterator<String> it = list.iterator();
       // Iterator<String> it = list.listIterator();

//        while(it.hasNext()){
//            System.out.println(it.next());
//        }
//
//
//      List<String> subList = list.subList(1,3);
//
//        System.out.println(subList);




//stack






        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Papaya");
        stack.push("Mango");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.empty());



    }


}
