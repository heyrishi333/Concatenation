import java.util.List;
import java.util.stream.Collectors;

public class Concatenation {

    public static void main(String[] args) {
        // List of strings to be concatenated
        List<String> strings = List.of("Hello", " ", "World", " ", "from", " ", "Java");

        // Concatenate using Stream API and method reference
        String result = strings.stream()
                               .collect(Collectors.joining()); // Using the joining collector

        // Output the concatenated string
        System.out.println(result);
    }
}