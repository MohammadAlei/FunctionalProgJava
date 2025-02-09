import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15, 148);
        // printCubesOfOddNumbersInListFunctional(numbers);
        // printOddNumbersInListFunctional(numbers);
        printEvenNumbers(numbers);
        printEvenNumX10(numbers);
        printSum(numbers);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker",
                "Kubernetes");
        printLengthGreater3(courses);
        printMinValue(numbers);
    }

    private static void printMinValue(List<Integer> numbers) {
        Integer min = numbers.stream().reduce(Integer.MAX_VALUE,((s1,s2) -> s1>s2 ? s2 : s1 ) );
        System.out.println("Min  value  : " + min  );
    }

    private static void printLengthGreater3(List<String> courses) {
        List<String> strG3 = courses.stream().filter(course -> course.length() > 3).collect(Collectors.toList());
        strG3.stream().forEach(System.out::println);
    }

    private static void printSum(List<Integer> numbers) {
        int val = numbers.stream().reduce(0, ((a, b) -> a + b));
        System.out.println("sum" + val);
    }

    private static void printEvenNumX10(List<Integer> numbers) {
        numbers.stream().filter(x -> x % 2 == 0).map(x -> x * 10).forEach(System.out::println);
    }

    private static void printEvenNumbers(List<Integer> numbers) {
        List<Integer> evenNum = numbers.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        evenNum.stream().forEach(System.out::println);
    }
}