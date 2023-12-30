
class S{
    public void show(){
        System.out.println("in  S show");
    }
    public void config(){
        System.out.println("in S config");
    }
}

class D extends S{
    public void show(){
        System.out.println("in D show");
    }
}

public class Methodoverriding {
    public static void main(String[] args) {
//        S obj = new S();
        D obj = new D();
        obj.show();
    }
}
