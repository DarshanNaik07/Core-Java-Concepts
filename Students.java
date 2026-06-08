// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;
// public class Students {

//     String name;
//     int age;

//     public Students(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     public String toString() {
//         return "Students [name=" + name + ", age=" + age + "]";
//     }

//     public static void main(String[] args) {

//         Comparator<Students> ascendingorder = new Comparator<>(){
//             public int compare(Students a, Students b){
//                 if(a.age > b.age){
//                     return 1;
//                 }
//                 else{
//                         return -1;
//                     }
//             }
//         };
//         List<Students> studs = new ArrayList<>();
//         studs.add(new Students("ganesh", 85));
//         studs.add(new Students("alice", 92));
//         studs.add(new Students("bob", 78));
//         studs.add(new Students("charlie", 95));
//         studs.add(new Students("david", 88));

//         Collections.sort(studs, ascendingorder);
//         System.out.println("After sorting: " + studs);
//     }
// }

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Students {
    
    String name;
    int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Students [name=" + name + ", age=" + age + "]";
    }

    public static void main(String[] args) {

        Comparator<Students> ascendingorder = (a, b) -> a.age > b.age ? 1 : -1;
        List<Students> studs = new ArrayList<>();
        studs.add(new Students("ganesh", 85));
        studs.add(new Students("alice", 92));
        studs.add(new Students("bob", 78));
        studs.add(new Students("charlie", 95));
        studs.add(new Students("david", 88));

        Collections.sort(studs, ascendingorder);
        System.out.println("After sorting: " +studs);
}
}