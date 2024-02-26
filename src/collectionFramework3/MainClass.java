package collectionFramework3;
import java.util.*;
public class MainClass {
    public static void main(String[] args) {


       // int a[] = new int[5]; //size is fixed;



      //dynamic in size;
//        List<Integer> list = new ArrayList<>();
//
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(12);
//        list2.add(99);
//        list2.add(33);
//
//       list.add(1);
//       list.add(20);
//       list.add(30);

//        System.out.println(list);
//        System.out.println(list.size());

        //System.out.println(list.contains(200));
        //removed index
       // list.remove(0);

      //if object pass actual value removed
        // list.remove(Integer.valueOf(1));



//        list.addAll(list2);
//
//        System.out.println(list);

//
//       Object c[] = list.toArray();
//
//     for(Object e: a){
//         Integer temp = (Integer)e;
//         System.out.println(temp);
//     }









     List<Integer> list  = new ArrayList<>();

     list.add(10);
     list.add(20);
     list.add(30);
     list.add(40);
     list.add(50);


        System.out.println(list.get(2));

        list.set(1,200);
        System.out.println(list);
        list.add(2,20);
        System.out.println(list);
        System.out.println(list.indexOf(20));














    }
}
