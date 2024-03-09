package array2;

import java.util.*;
import java.util.Arrays;

public class MainClass {

    public static void main(String[] args) {
int a[] = {12, 9, 8, 2, 11, 5, 4, 5};
// minimumDifference(a);
        System.out.println(maxAbsoluteDiff(a));

    }

static int maxAbsoluteDiff(int a[]){
        int n = a.length;
//        int aipi[] = new int[n];
//        int aimi[] = new int[n];
    int minAipi = Integer.MAX_VALUE;
    int maxAipi = Integer.MIN_VALUE;
    int minAimi = Integer.MAX_VALUE;
    int maxAimi = Integer.MIN_VALUE;




        for(int i = 0; i< n ; i++){
//            aipi[i] = a[i] + i;
//            aimi[i] = a[i] -i;


            minAipi = Math.min(minAipi, a[i]+i);
            maxAipi = Math.max(maxAipi, a[i]+i);


            minAimi = Math.min(minAimi, a[i]-i);
            maxAimi = Math.max(maxAimi, a[i]-i);




        }

//        for(int e: aipi){
//            minAipi = Math.min(minAipi, e);
//            maxAipi = Math.max(maxAipi, e);
//        }


//        for(int e: aimi){
//            minAimi = Math.min(minAimi, e);
//            maxAimi = Math.max(maxAimi, e);
//           }


        return Math.max((maxAipi - minAipi), (maxAimi - minAimi));

}

    static void minimumDifference(int a[]){
        Arrays.sort(a);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        int minDiff = Integer.MAX_VALUE;
        int n = a.length;
        for(int i = 1; i<n ; i++){
             int diff = a[i]-a[i-1];
             if(diff < minDiff){
                 minDiff = diff;
             }
        }

        for(int i = 1; i < n; i++){
            int diff = a[i]-a[i-1];
            if(diff == minDiff){
            ArrayList<Integer> list = new ArrayList<>();
            list.add(a[i-1]);
            list.add(a[i]);
            ans.add(list);
            }
        }

        System.out.println(ans);
    }
}
