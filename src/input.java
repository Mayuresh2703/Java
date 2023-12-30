import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class input {
    public static void main(String[] a) throws IOException {
        System.out.println("Enter a number");
//        int num = System.in.read();
//
//        System.out.println(num);//provides ASCII value
//
//        System.out.println(num - 48);

//        METHOD-2->
//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(in);
//
//        int num = Integer.parseInt(bf.readLine());
//        System.out.println(num);
//
//        bf.close();


//        METHOD-3->
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);


    }
}
