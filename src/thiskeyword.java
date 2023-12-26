
class Human{
    //    private int age = 11;
    private int age;
//    private String name = "Mayuresh";

    private String name;
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
//this keyword is used to represent current object
    public String getName(){
        return name;
    }

}
public class thiskeyword {

    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(21);
        obj.setName("Mayuresh");
//        obj.age = 11;
//        obj.name = "Mayuresh";

        System.out.println(obj.getAge() + " " +obj.getName());
    }
}
