public class exceptions {
    public static void main(String[] a) {

        int i = 4;
        int j = 0;

        int nums[] = new int[5];

        try{
            j = 18/i;
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch (ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array is acessing out of limits ");
        }
        catch (Exception e){
            System.out.println("Something Went Wrong");
        }

        System.out.println(j);

        System.out.println("Bye");

//NOTE-> EXCEPTIONS CAN BE HANDLED BUT ERROR CANNOT BE HANDLED....
//        RUNTIME EXCEPTIONS LIKE ->
//                ARITHMETIC, ARRAY INDEX OUT OF BOUND, NULL POINTER
//          ARE CALLED UNCHECKED EXCEPTIONS

//        BUT ALL OTHER EXCEPTIONS LIKE SQLEXCEPTIONS,IOEXCEPTIONS ARE CALLED
//        CHECKED EXCEPTIONS

    }

}
