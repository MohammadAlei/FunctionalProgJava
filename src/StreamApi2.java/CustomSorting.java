import java.util.Comparator;
import java.util.List;

public class CustomSorting {
    public static void main(String[] args) {

    List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker");
    Comparator<String> cmp = (c2,c1) -> c2.compareTo(c1);
    courses.stream()
    .sorted(cmp.reversed())
    .forEach(System.out::println);
    
    System.out.println("---------------------------------------");

    courses.stream().sorted(Comparator.comparing(str -> ((String) str).length() ).reversed()).forEach(System.out::println);
    
}
}
