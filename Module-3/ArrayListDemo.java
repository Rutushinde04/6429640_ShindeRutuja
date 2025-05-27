import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        String input;
        do {
            System.out.print("Enter student name (or 'exit' to stop): ");
            input = sc.nextLine();
            if (!input.equalsIgnoreCase("exit")) {
                students.add(input);
            }
        } while (!input.equalsIgnoreCase("exit"));

        System.out.println("Students entered:");
        students.forEach(System.out::println);
    }
}

