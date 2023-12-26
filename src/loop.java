public class loop {
    public static void main(String[] args) {
//        int i = 1;
//        while(i<=4){
//            System.out.println("Hi" + i);
//
//            i++;
//        }

//        do{
//            System.out.println("Hi" + i);
//
//            i++;
//        }while(i<=4);

//        for (int i = 4; i >=1 ; i++) {
//            System.out.println("Hi" + i);
//        }

        for (int i = 1; i <=5 ; i++) {
            System.out.println("DAY" + i);

            for (int j = 1; j < 9; j++) {
                System.out.println(" " + (j+8) + " - " + (j+9));
            }
        }

    }
}
