import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;
        Function<Integer, Integer> squareFunction = x -> x * x;
        Consumer<Integer> sysoutConsumer = System.out::println;

        numbers.stream()
            .filter(isEvenPredicate)   // Apply Predicate to filter even numbers
            .map(squareFunction)       // Apply Function to map numbers to squares
            .forEach(sysoutConsumer);  // Apply Consumer to print each number

         Supplier<String> supplier = () -> "Ranga";
         System.out.println(supplier.get());
    }
}
