package arraysFunctionString4;

public class MainClass {
    public static void main(String[] args) {
       // int [] a ={1,2,3,4,5,-67,8};
//        for(int e: a){
//            System.out.print(e+" ");
//        }
//        System.out.println();
//        swapTwoNumbersInArray(a,1,3);
//        for(int e: a){
//            System.out.print(e+" ");
//        }
       // System.out.println(smallestNumberInArray(a));


//        int a[] ={4, 5, 6, 8, 9, 14};
//        placedLastNumberInSortedPos(a);
//        for(int e: a){
//          System.out.print(e+" ");
//        }

        int a[] ={ 4, 1, 8, 2, 3, 7,-99};
       // bubbleSort(a);
        //selectionSort(a);
        insertionSort(a);
       for(int e: a){
        System.out.print(e+" ");
       }



    }

     static void insertionSort(int []a){
        int n = a.length;
        for(int i = 1; i < n; i++){
            int cur = a[i];
            int j = i-1;

            while(j >= 0 && a[j] > cur){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = cur;
        }


     }
          static void selectionSort(int []a) {
             int n = a.length;
             for(int i = 0; i < n-1; i++){
                 int min = i;
                 for(int j = i+1; j < n; j++){
                     if(a[j] < a[min]){
                         min = j;
                     }
                 }
                 int temp = a[i];
                 a[i] = a[min];
                 a[min] = temp;


             }
          }

    static void bubbleSort(int []a){
        int n = a.length;
        for(int i = 0; i<n-1; i++){
            boolean isChack = false;
            for(int j = 0; j<n-1-i; j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    isChack = true;
                }
                //printArray(a);
            }
            if(!isChack)break;
        }
    }

    static void printArray(int []a){
        for(int e: a){
            System.out.print(e+" ");
        }
        System.out.println();
    }
  static void placedLastNumberInSortedPos(int []a){
        int n = a.length;
        int i = n-2;
        int lastNumber = a[n-1];
        while(i >= 0 && a[i] > lastNumber){
            a[i+1] = a[i];
            i--;

        }
        if(i<0){
            a[0] = lastNumber;
        }else {
            a[i+1] = lastNumber;
        }

  }
    static int smallestNumberInArray(int []a){
        int min = Integer.MAX_VALUE;
        for(int e: a){
            if(e < min){
                min  = e;
            }
        }
        return min;

    }
    static void swapTwoNumbersInArray(int []a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
