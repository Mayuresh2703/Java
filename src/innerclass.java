//
//class A{
//    int age;
//
//    public void show(){
//        System.out.println("in show");
//    }
//
//    class B{
//        public void config(){
//            System.out.println("in config");
//        }
//    }
////NOTE -> STATIC CAN ONLY BE USED FOR INNER CLASS NOT OUTER CLASS,
////    A CANNOT BECOME STATIC.
//    static class B{
//        public void config(){
//            System.out.println("in config");
//        }
//    }
//}
//
//
//public class innerclass {
//    public static void main(String[] args) {
//            A obj = new A();
//            obj.show();
//
////            for inner class we use/call objects like this ->
//        A.B obj1 = obj.new B();
//        obj1.config();
////        but if class is static,we don't require object of A class,we directlycall
////        like this ->  A.B obj = new A.B();
////                      obj1.config();
//
//
//    }
//}
