package oops4;

public class LearnAnonymousClasses {


//     class InnerClass extends OuterClass{
//
//     }

    // AnonymousClass
//    OuterClass obj = new OuterClass(){
//        void sing(){
//
//        }
//        public void outerMethod(){
//
//        }
//    };



//    SuperInterface obj2 = new SuperInterface() {
//        @Override
//        public void interfaceMethod() {
//
//        }
//    };



    SuperInterface obj3 =  () -> {

    };




    public static void main(String[] args) {
        WalkAble walkAble =  (int steps) -> {
            System.out.println("'walked "+ steps);
            return steps;
        };

        walkAble.walks(12);
        walkAble.walks(99);

        WalkAble obj2 = (int steps) -> 2*steps;

        System.out.println(obj2.walks(22));




    }
}

class OuterClass{
    public void outerMethod(){

    }
}

@FunctionalInterface
interface  SuperInterface{
    void interfaceMethod();
}

interface WalkAble {
    int walks(int steps);
}





