import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaSortDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Zara");
        names.add("Mike");
        names.add("Anna");
        names.add("John");

        System.out.println("Before sorting: " + names);

        Collections.sort(names, (a, b) -> a.compareToIgnoreCase(b));

        System.out.println("After sorting: " + names);
    }
}

