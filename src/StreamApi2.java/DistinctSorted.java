import java.util.List;

public class DistinctSorted {
    public static void main(String[] args) {
        List<Integer> num = List.of(1,4,90,3,23,3,90);
        num.stream().sorted().distinct().forEach(System.out::println);
    }
}
