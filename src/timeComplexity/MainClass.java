package timeComplexity;

public class MainClass {
    public static void main(String[] args) {
        int a[] ={1,2,3};
        //Time Complexity(O(1))
       // System.out.println(getFirstNumber(a));

        //time Complexity(O(n))
       // System.out.println(checkNumberIsPresent(a,3));
        printAllPairs(a);
    }
    static int getFirstNumber(int a[]){
        return a[0];
    }
    static  boolean checkNumberIsPresent(int a[], int key){
        for(int e: a){
            if(e == key)return true;

        }
        return false;
    }

    static void printAllPairs(int a[]){
        int n = a.length;
        for(int i = 0; i < n-1; i++){
           for(int j = i+1; j < n; j++ ){
               System.out.println(a[i]+" :"+ a[j]+" ");
           }

        }
    }
}

