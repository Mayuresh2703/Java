public class multidimentionalarray {
    public static void main(String[] a) {
        int nums[][] = new int[3][4];

        int array1[][] = new int[3][]; // jagged array -> array's whose size is not fixed

        array1[0] = new int[3];
        array1[1] = new int[4];
        array1[2] = new int[2];


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                nums[i][j] = (int)( Math.random() * 10);
//                for double digit values ->multiply by 100
//                for single digit values ->multiply by  10
                System.out.println(nums[i][j]);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(nums[i][j] + " ");
            }
            System.out.println();
        }

//   enhaced loop
        for(int n[] : nums){
            for(int m:n){
                System.out.println(m + " ");
            }
            System.out.println();
        }

        //    jagged array
        for(int i=0;i<array1.length;i++){
            for (int j = 0; j < array1[i].length; j++) {
                array1[i][j] = (int)(Math.random()*10);
            }
        }

        for(int z[] : array1){
            for(int m:z){
                System.out.println(m + " ");
            }
            System.out.println();
        }

    }

}
