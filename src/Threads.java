//When we want to execute two methods at same time
//then we use Threads...

class A extends Thread{
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for (int i = 1; i <=10 ; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class Threads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

//        obj1.setPriority(Thread.MAX_PRIORITY);


        obj1.start();
//start is a method that belongs to Thread class
//it will create a new thread for you but for it to run,
//  every thread must have a run method
        obj2.start();
    }
}
