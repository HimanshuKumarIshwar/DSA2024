package oops1;

public class LearnConstructor {
    public static void main(String[] args) {
    Complex2 c1 = new Complex2(12,22);
//       c1.a = 11;
//       c1.b = 12;
       c1.print();
       Complex2 c2 = new Complex2(22,45);
       c2.print();
       Complex2 c3 = new Complex2(111);
       c3.print();
       Complex2 result = c1.add(c2);
       result.print();

    }
}


class Complex2{
    int a;
    int b;

   public Complex2(int real, int imaginary){
        a = real;
        b = imaginary;
    }
public Complex2(int real){
       a = real;
       b = 12;
}

   Complex2 add(Complex2 num){
       return new Complex2(this.a+num.a, +this.b+num.b);
   }

   void print(){
       System.out.println(a+" + "+b+"i");
   }
}
