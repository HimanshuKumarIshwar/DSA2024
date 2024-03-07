package backtracking2;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        int arr[]  ={1, 2, 3};
        ArrayList<int[]> ans = new ArrayList<>();
        permute(arr, 0, arr.length-1, ans);

        System.out.println("Printing ans array");

        for(int []a: ans){
            printArray(a);
        }
    }

    static void permute(int arr[], int l, int r,  ArrayList<int[]> ans){
        if(l == r){
            printArray(arr);
           int []b = new int[arr.length];
           for(int i = 0; i< arr.length; i++){
               b[i] = arr[i];
           }
           ans.add(b);

            return;
        }

        for(int i =l; i<=r; i++){
            swap(arr,l,i);
            permute(arr, l+1, r, ans);
            swap(arr, l, i);
        }
    }
    static void printArray(int []arr){
        for(int e: arr){
            System.out.print(e+" ");
        }
        System.out.println();
    }

    static void swap(int a[], int i, int j){
        int temp = a[i];
         a[i] = a[j];
         a[j] = temp;
    }
}
