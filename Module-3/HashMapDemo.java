import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        String choice;
        do {
            System.out.print("Enter student ID (integer): ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            studentMap.put(id, name);

            System.out.print("Add another? (yes/no): ");
            choice = sc.nextLine();
        } while (choice.equalsIgnoreCase("yes"));

        // Retrieve by ID
        System.out.print("Enter ID to retrieve name: ");
        int searchId = sc.nextInt();

        if (studentMap.containsKey(searchId)) {
            System.out.println("Student name: " + studentMap.get(searchId));
        } else {
            System.out.println("ID not found.");
        }
    }
}

