
//final keyword -> can be used with variable,method, class

class Calc{
    public  void show(){
        System.out.println("in Calc Show");
    }
    public void add(int a,int b){
        System.out.println(a+b);
    }
}

class AdvCalc extends Calc{
    public  void show(){
        System.out.println("By John");
    }
}

public class finalkeyword {
    public static void main(String[] args) {
//        final int num = 8;
////        num = 9; -> will give error
//        System.out.println(num);
        AdvCalc obj = new AdvCalc();
        obj.show();
        obj.add(4,5);
    }
}
