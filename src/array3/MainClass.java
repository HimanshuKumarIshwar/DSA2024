package array3;
import java.util.*;


public class MainClass {

    public static void main(String[] args) {
        int a[] ={4, 2, 2, 2, 1, 1, 1, -1, -3, 0, 1, 2, 3, 3, 3};
        int sum = 5;
          Arrays.sort(a);
       List<List<Integer>> triplets = new ArrayList<>();

       for(int i = 0; i < a.length-2; i++){
           if( i > 0 && a[i] == a[i-1]){
              continue;
           }

         List<List<Integer>> twoSum = twoSum(a, -a[i], i+1);
          for(List<Integer> list: twoSum){
              list.add(0, a[i]);
              triplets.add(list);
          }


       }


        System.out.println(triplets);



    }







   static List<List<Integer>> twoSum(int []a, int k, int startFrom){
       int l = startFrom;
       int r = a.length-1;
       int n = a.length;

  List<List<Integer>> ans = new ArrayList<>();
       while(l < r){
           if( l > 0 && a[l] == a[l-1]){
               l++;
               continue;
           }

           if(r < n-1 && a[r] == a[r+1]){
               r--;
               continue;
           }

           int curSum = a[l] + a[r];
           if(curSum > k){
               r--;
           } else if (curSum < k) {
                      l++;
           }
           else {

               List<Integer> list = new ArrayList<>();
                list.add(a[l]);
                list.add(a[r]);
                ans.add(list);
                l++;
                r--;
           }
       }

       return ans;

   }


}
