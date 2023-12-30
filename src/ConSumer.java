import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ConSumer {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList( 4,5,7,3,2,6);

//        Consumer<Integer> con = n -> System.out.println(n);

        Stream<Integer> sortedValues = nums.stream()
                .filter(n -> n%2==0)
                .sorted();


//        Stream<Integer> s1 = nums.stream();
//        Stream<Integer> s2 = s1.filter(n -> n%2==0);
//        Stream<Integer> s3 = s2.map(n -> n*2);
//        int result = s3.reduce(0 , (c,e) -> c+e);

//        Predicate<Integer> p = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer t) {
//                if(n%2==0)
//                    return true;
//                else
//                    return false;
//            }
//        };

//        int result = nums.stream()
//                .filter(n -> n%2==0)
//                .map(n -> n*2)
//                .reduce(0, (c,e) -> c+e);
//
//
//        System.out.println(result);

//        s1.forEach(n -> System.out.println(n));
//        s1.forEach(n -> System.out.println(n));


//        nums.forEach(con);

        System.out.println(sortedValues);
        sortedValues.forEach(n -> System.out.println(n));
    }
}
