import java.util.Scanner;

public class DataTypeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer value: ");
        int myInt = scanner.nextInt();

        System.out.print("Enter a float value: ");
        float myFloat = scanner.nextFloat();

        System.out.print("Enter a double value: ");
        double myDouble = scanner.nextDouble();

        System.out.print("Enter a character: ");
        char myChar = scanner.next().charAt(0);

        System.out.print("Enter a boolean value (true/false): ");
        boolean myBoolean = scanner.nextBoolean();

        System.out.println("\nYou entered:");
        System.out.println("Integer: " + myInt);
        System.out.println("Float: " + myFloat);
        System.out.println("Double: " + myDouble);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBoolean);

        scanner.close();
    }
}

