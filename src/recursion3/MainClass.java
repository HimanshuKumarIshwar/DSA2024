package recursion3;

public class MainClass {

    public static void main(String[] args) {
//        String s = "aba";
//        System.out.println(isPalindrome(s,0,s.length()-1));

        String s = "ababbabac";
        String t = "aba";
        //System.out.println(countOccurrenceInString(s, t, 0));
        printAllSubSetOfString("abc", "", 0);


    }

    static boolean isPalindrome(String s, int l, int r){
        if(l>=r)return true;
        if(s.charAt(l) == s.charAt(r)){
            return isPalindrome(s, l+1, r-1);
        }else{
            return false;
        }
    }

static int countOccurrenceInString(String s, String t, int index){
        if(index > s.length() - t.length())return 0;

        if(s.substring(index,index+t.length()).equals(t)){
            return countOccurrenceInString(s, t, index+1) + 1;
        }else {
            return countOccurrenceInString(s,t,index+1);
        }
}

  static void printAllSubSetOfString(String s, String cur, int i){
        if(i == s.length()){
            System.out.println(cur);
          return;
        }

          printAllSubSetOfString(s, cur, i+1);
      printAllSubSetOfString(s,cur+s.charAt(i), i+1);



  }



}

