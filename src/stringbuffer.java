public class stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("mayuresh");
        System.out.println(sb.capacity());
        sb.append(" Shinge");

        System.out.println(sb);

//        String str = sb.toString();
        sb.deleteCharAt(2);
        System.out.println(sb);

        sb.insert(8,"Java ");
        sb.setLength(18);

        System.out.println(sb);
    }
}
