package array5;

import java.util.*;
public class MainClass {
    public static void main(String[] args) {
int [][]m = {{3, 63, 42},
            {18, 12, 12},
             {15, 21, 18},
             {33, 84, 24}
               };

int []inArray = convertmatrixInArray(m);


   Arrays.sort(inArray);

        System.out.println(minOperationMakesEqual(inArray, 3));


    }

    static int minOperationMakesEqual(int []a, int k){

        for(int e: a){
            if(e%k !=0)return -1;
        }
        int count = 0;
        int madian = a[a.length/2];
        for(int e: a){
            int data = Math.abs(e-madian);
            count+= data/k;
        }


       return count;
    }

    static int [] convertmatrixInArray(int [][]m){
       int row = m.length;
       int col = m[0].length;

       int [] ans = new int[row*col];

       for(int i = 0; i< row; i++){
           for(int j = 0; j < col; j++){
               ans[(i*col)+j] = m[i][j];
           }
       }
       return ans;
    }
}
