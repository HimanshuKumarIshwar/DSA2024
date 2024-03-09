package array1;
import java.util.*;
public class MainClass {

    public static void main(String[] args) {
        int a[] ={1, 2, 3, 4, 5, 23, 6,-2};
       // int b[] = {2, 3, 4, 5};
       // multipleLeftRotation(a, b);
         // multipleRotationsModified(a, b);

         //waveArray(a);
        waveArrayNotLexicography(a);
         for(int temp: a){
             System.out.print(temp+" ");
         }
        System.out.println();


    }



static void waveArray(int a[]){
        int n = a.length;
        Arrays.sort(a);

       for(int i = 1; i< n; i+=2) {

             int  temp = a[i-1];
               a[i-1] = a[i];
               a[i] = temp;

       }

}


static void waveArrayNotLexicography(int a[]){
        int n = a.length;
    for(int i = 1; i < n; i+=2) {
      if(a[i] > a[i-1]){
         swap(a, i, i-1);
      }

      if( i < n-1 && a[i] > a[i+1]){
          swap(a, i, i+1);
      }


    }
}

static void swap(int a[], int i, int j){
    int  temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}








 static void multipleRotationsModified(int a[], int b[]){
        int n = a.length;
        int m = b.length;
        int ans [][]= new int[m][n];

        int temp[] = new int[2*n];
        for(int i = 0; i < n; i++){
            temp[i] = a[i];
            temp[i+n] = a[i];
        }


        for(int i = 0; i < m; i++){
           int offset = b[i] % n;

           for(int j =0; j <n; j++){
               ans[i][j] = temp[j+offset];
           }


        }


        for(int[] arr: ans){
            for(int e: arr){
                System.out.print(e+" ");
            }
            System.out.println();
        }




 }






    static void multipleLeftRotation(int []a, int []b){
        int n = a.length;
        int m = b.length;

        for(int i = 0; i <m; i++){
            for(int j = 0; j < b[i]; j++){
                int temp = a[0];
                for(int k = 0; k < n-1; k++){
                    a[k] = a[k+1];
                }
                a[n-1] = temp;
            }
            for(int e: a){
                System.out.print(e+" ");
            }
            System.out.println();


            for(int j = 0; j <(a.length- b[i]); j++){
                int temp = a[0];
                for(int k = 0; k < n-1; k++){
                    a[k] = a[k+1];
                }
                a[n-1] = temp;
            }
        }







    }



}
