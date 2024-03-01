package collectionFramework5;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
       Map<String, String> map = new HashMap<>();

       map.put("us", "United States");
       map.put("In", "India");
       map.put("en", "India");
//       map.putIfAbsent("in", "India2");
//        System.out.println(map);
//        map.remove("en");
//        System.out.println(map.get("in"));
//        System.out.println(map.getOrDefault("hj", "default"));
//        System.out.println(map.containsValue("fhgj"));



  // Set<String> keys = map.keySet();
        ArrayList<String> keys = new ArrayList<>(map.keySet());
        System.out.println(keys);




       Collection<String> values = map.values();

       Set<Map.Entry<String, String>> entries = map.entrySet();


       for(Map.Entry<String, String> entry: entries){
           System.out.println(entry.getKey()+" -> "+ entry.getValue());
       }













    }
}



