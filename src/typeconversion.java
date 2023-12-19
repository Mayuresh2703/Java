public class typeconversion {
    public static void main(String[] args) {
//        byte b = 127;
//        byte b = 257;
//        will give error possible lossy conversion from int to byte
//        int a = b;
//        int a = 257;
//        byte k = (byte) a;
//        It will perform modulous as it is out of range
//        System.out.println(k);
//        System.out.println(a);

        byte a = 10;
        byte b = 30;

        int result = a*b;
//This is called type promotion, byte is promoted to int type.
        System.out.println(result);


    }
}
