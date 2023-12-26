public class string {
    public static void main(String[] args) {
//        String name = "mayuresh";
        String name = new String("mayuresh");
//        System.out.println(name);
//        System.out.println(name.hashCode());

        System.out.println("hello" + name);
        System.out.println(name.charAt(1));
        System.out.println(name.concat(" Shinge"));

        name = name + " shinge";
        System.out.println("hello " + name);
    }

}
