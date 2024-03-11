package array4;

public class MainClass {
    public static void main(String[] args) {
    int a[] ={1, 2, 5, 6, 7, 2};
    int target = 7;
        System.out.println(minimumSumSubArray(a, target));




    }
    static int minimumSumSubArray(int a[], int target){
        int l = 0, r = 0;

        int curSum =0;
        int minLength = Integer.MAX_VALUE;
        int n = a.length;

        while(r < n){
            curSum += a[r];

            while(curSum >= target){
                minLength = Math.min(minLength, (r-l) +1);
                curSum -= a[l];
                l++;
            }
            r++;
        }

        if(minLength == Integer.MAX_VALUE){
            return 0;
        }
        return minLength;

    }


   }
