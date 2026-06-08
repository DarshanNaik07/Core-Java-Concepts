package OptionalClassEx;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalEx {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Darshan", "Laksmi", "Jeevan", "hemanth");
    
    Optional<String> find = name.stream()
                                .filter(str -> str.contains("x"))
                                .findFirst();

    System.out.println(find.orElse("Not found"));
    }
    
}
