package oops5;
import java.util.*;
import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {


//        List<Integer> list = new ArrayList<>();
//        List<Integer> list2 = new LinkedList<>();


//Data d = new Data();
//   d.data = 11;

      Data d;
      d = new ChildData();
         d.printData();

         ChildData cd = new ChildData();
         cd.printData(12);



//   int a = 124;
//        System.out.println(d.data);
//        System.out.println(a);
//        changeData(d,a);
//        System.out.println(d.data);

        



    }

    static void changeData(Data d, int a){
        d.data = 999;
        a = 999;
    }

}

class Data{
    int data;

    public void printData(){
        System.out.println(data);
    }
}

class ChildData extends Data{

    @Override
    public void printData(){
        System.out.println("Override " + data);
    }

    public void printData(int times){
        for(int i =0 ; i < times; i++){
            System.out.println("Override " + data);
        }
    }
}


