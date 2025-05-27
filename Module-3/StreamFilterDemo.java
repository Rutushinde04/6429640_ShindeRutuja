import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 8, 13, 24, 7, 16, 4);

        List<Integer> evens = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even numbers: " + evens);
    }
}
