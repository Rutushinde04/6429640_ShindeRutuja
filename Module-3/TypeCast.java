import java.util.Scanner;

public class TypeCast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a double value: ");
        double myDouble = scanner.nextDouble();

        int convertedInt = (int) myDouble;
        System.out.print("Enter an integer value: ");
        int myInt = scanner.nextInt();

        double convertedDouble = myInt;

        System.out.println("\nType Casting Results:");
        System.out.println("Original double: " + myDouble);
        System.out.println("After casting to int: " + convertedInt);
        System.out.println("Original int: " + myInt);
        System.out.println("After casting to double: " + convertedDouble);

        scanner.close();
    }
}
