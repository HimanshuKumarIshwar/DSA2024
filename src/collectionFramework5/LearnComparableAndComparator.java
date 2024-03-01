package collectionFramework5;
import java.net.CookieHandler;
import java.util.*;
public class LearnComparableAndComparator {


    public static void main(String[] args) {
        Animal a1 = new Animal(4, "leo", 10);
        Animal a2 = new Animal(2, "Bruno", 4);
        Animal a3 = new Animal(2, "Maxo", 5);
        Animal a4 = new Animal(2, "Don", 4);
        Animal a5 = new Animal(5, "Bujo", 3);

        List<Animal> dogs = new ArrayList<>();
        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);
        dogs.add(a5);


        System.out.println(dogs);
       // using comparable
       // Collections.sort(dogs);

        //using comparator -> it is anonymous class
//        Collections.sort(dogs, new Comparator<Animal>() {
//            @Override
//            public int compare(Animal o1, Animal o2) {
//               // return o1.wt - o2.wt;
//                return Integer.compare(o1.wt,  o2.wt);
//            }
//        });


        // using lambda expression


       // Collections.sort(dogs, (o1,  o2)-> o1.age - o2.age);


//        Collections.sort(dogs, (o1, o2)-> {
//            return o1.name.compareTo(o2.name);
//        });

      // for use this define getter of all parameter;
//        Collections.sort(dogs, Comparator.comparing(Animal::getAge).thenComparing(Animal::getName).thenComparing(Animal::getAge));
//       System.out.println(dogs);

       // use this way Mostly
//       Collections.sort(dogs, (d1, d2)->{
//
//       })



        int a[][] = {{4,5,2},
                     {5,1,2},
                    {1,4,7},
                {1,4,6}};


//        Arrays.sort(a, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[0]-o2[2];
//            }
//        });

        //Arrays.sort(a, (int []o1, int []o2)-> o1[0]-o2[0]);
//        Arrays.sort(a,(int []arr1, int []arr2)-> {
//            if(arr1[0] == arr2[0]){
//                return arr1[1]-arr2[1];
//            }
//            return arr1[0]-arr2[0];
//        });


        Arrays.sort(a,(int []arr1, int []arr2)-> {
            for(int i = 0; i < a.length-1; i++){
                if(arr1[i]!=arr2[i])return arr1[i]-arr2[i];
            }
            return arr1[a.length-1]-arr2[a.length-1];

        });


       for(int i = 0; i<a.length; i++){
           for(int b: a[i]){
               System.out.print(b +" ");
           }
           System.out.println();
       }







    }
}
