
class F{
    public void show(){
        System.out.println("in A show");
    }
}

public class anonymousinnerclass {
    public static void main(String[] args) {
        F obj = new F(){
            public void show(){
                System.out.println("in new show");
            }
        };
        obj.show();
    }
}
