import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Sorting {
    public static void main(String[] args) {

        Comparator<Integer> ascendingorder = new Comparator<Integer>(){
            public int compare(Integer a, Integer b){
                if(a%10 > b%10){
                    return 1;
                }
                else{
                        return -1;
                    }
            }
        };
        List<Integer> numbers = new ArrayList<>();
        numbers.add(51);
        numbers.add(27);
        numbers.add(92);
        numbers.add(16);
        numbers.add(38);

        Collections.sort(numbers, ascendingorder);
        System.out.println("After sorting: " + numbers);
    }
}

//String sorting
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;
// public class Sorting {
//     public static void main(String[] args) {

//         Comparator<String> ascendingorder = new Comparator<String>(){
//             public int compare(String a, String b){
//                 if(a.length() > b.length()){
//                     return 1;
//                 }
//                 else{
//                     return -1;
//                 }
//                 }
//         };
//         List<String> numbers = new ArrayList<>();
//         numbers.add("Darshan");
//         numbers.add("Alice");
//         numbers.add("Bob");
//         numbers.add("Charlie");
//         numbers.add("David");

//         System.out.println("Before sorting: " + numbers);
//         Collections.sort(numbers, ascendingorder);
//         System.out.println("After sorting: " + numbers);
//     }
// }