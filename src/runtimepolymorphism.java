////RUN TIME POLYMORPHISM USING DYNAMIC DISPATCH METHOD
//class A{
//        public  void show(){
//            System.out.println("in A Show");
//        }
//}
//
//class B extends  A{
//    public  void show(){
//        System.out.println("in B Show");
//    }
//}
//class C extends A{
//    public  void show(){
//        System.out.println("in C Show");
//    }
//}
//
//
//public class runtimepolymorphism {
//    public static void main(String[] args) {
////        B obj = new B(); -> normal method
////        we can refer type as parent but object is child like, we can write->
////        A obj = new B();
//        A obj = new A();
//        obj.show();
//
////        we can assign new object to old variable
//        obj = new B();
//        obj.show();
//    }
//}
