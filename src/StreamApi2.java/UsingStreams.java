import java.util.List;
import java.util.Optional;

public class UsingStreams {
    public static void main(String[] args) {
        //print all min string values

        Utility u = new Utility();
        Optional<Integer> minNum =  u.courses.stream()
                 .map(String::length)
                 .min(Integer::compareTo);
        minNum.ifPresent( val ->
            u.courses.stream()
            .filter(course -> course.length() == val)
            .forEach(s -> System.out.println(s + " (length: " + val + ")"))

            // collect(Collectors.toList(););
         );
    }
}
class Utility {

    List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15, 148);

    List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
                    "Kubernetes");

    public void printStringValues(List<String> strs){
        strs.stream().forEach(System.out::println);
    }

    public void printNumValues(List<Integer> num){
        num.stream().forEach(System.out::println);
    }
}