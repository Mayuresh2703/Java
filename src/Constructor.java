class Human1 {

    private int age;
    private String name;

    Human1() {
        age = 0;
        name = " ";
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Constructor {

    public static void main(String args[]) {
        Human1 human = new Human1();
        // human.age = 18;
        // human.name = "ABC";
        human.setAge(10);
        human.setName("ABC");
        System.out.println(human.getName() + " " + human.getAge());
    }
}