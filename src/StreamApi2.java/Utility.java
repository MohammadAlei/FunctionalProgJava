import java.util.List;

public class Utility {

    static List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15, 148);

    static List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
                "Kubernetes");

    public static void printStringValues(List<String> strs){
        strs.stream().forEach(System.out::println);
    }

    public static void printNumValues(List<Integer> num){
        num.stream().forEach(System.out::println);
    }
}