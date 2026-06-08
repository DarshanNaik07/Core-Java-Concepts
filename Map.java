import java.util.HashMap;
class Map{
    public static void main(String[] args){
        HashMap<String, Integer> students = new HashMap<>();
        students.put("Ganesh", 85);
        students.put("Sita", 90);
        students.put("Ravi", 78);
        students.put("Anita", 92);

        for(String key : students.keySet()){
            System.out.println("Name: " + key + ", Score: " + students.get(key));
        }
    }
}