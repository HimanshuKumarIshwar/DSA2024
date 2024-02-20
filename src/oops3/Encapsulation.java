package oops3;

public class Encapsulation {
    static boolean isResume = false;
    public static void main(String[] args) {
        Account user1 = new Account();

   user1.setAmount(1200000, 1234);
        System.out.println(user1.getAmount());
        System.out.println(Encapsulation.isResume);


        System.out.println(Math.max(12, 23));


    }
}
class Account{
   private final int password = 1234;
   private  int amount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount, int password) {
        if(this.password == password) {
            this.amount = amount;
        }

    }

}
