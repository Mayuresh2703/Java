import java.util.*;

public class Collections {
    public static void main(String[] args) {

//        List<Integer> nums = new ArrayList<Integer>();
        Collection<Integer> nums = new TreeSet<Integer>();
//        Set<Integer> nums = new HashSet<Integer>();
//        Set<Integer> nums = new TreeSet<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(2);
//Set does not gives values in sorted order and does not contains duplicate values and doesn't supports index values
//        But Tree set has all value in sorted order
//        for(int n : nums) System.out.println(n);


        Iterator<Integer> values = nums.iterator();

        while (values.hasNext())
            System.out.println(values.next());


//        System.out.println(nums.get(2));

//        Collection doesn't supports index values but List supports index values
//                Collection
//             ________|____________________________________
//             |                     |                     |
//          List                   Queue               Set
//            |                       |                 |
//       Arraylist,Linkedlist      Dequeue          Hashset,LinkedHashset
    }
}
