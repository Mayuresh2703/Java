
class Mobile{
    String brand;
    int price;
    static String name;
    //will have same value for all ovjects or reference variables
//    the above 3 are called instance variable

//    static {
//        name = "Phone";
//        System.out.println("in static block");
//    }
//    static block will be called only once
    public Mobile(){
        brand = "";
        price = 200;
        System.out.println("In constructor");
    }

    static {
        name = "Phone";
        System.out.println("in static block");
    }
//    Why static block is called first and why only once??
    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }
    public void show1(){
        System.out.println("In static method");
    }
}

public class Mobiles {
    public static void main(String[] args) {
//        The main method is static, since we need to call the object of class if its
//        not static and if not set it as static it will create a deadlock.
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        obj1.name = "SmartPhone";

//        Mobile obj2 = new Mobile();
//        obj2.brand = "Samsung";
//        obj2.price = 1700;
//        obj2.name = "SmartPhone";
//
//        obj1.name = "Phone";
//        Mobile.name = "Phone";
////        Static variables should be called with  class name
//
//        obj1.show();
//        obj2.show();
//        Mobile.show();  can't call normal method with class name
//        But we can use a static method to call it with class name.
//        Mobile.show1();
        Mobile obj2 = new Mobile();

    }
}
