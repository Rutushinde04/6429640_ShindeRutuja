import java.util.Scanner;

public class OperatorPrecedence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        int a = scanner.nextInt();

        System.out.print("Enter second number (b): ");
        int b = scanner.nextInt();

        System.out.print("Enter third number (c): ");
        int c = scanner.nextInt();

        int result1 = a + b * c;
        int result2 = (a + b) * c;

        System.out.println("\nExpression Results:");
        System.out.println("a + b * c = " + result1);
        System.out.println("(a + b) * c = " + result2);

        System.out.println("\nExplanation:");
        System.out.println("Multiplication has higher precedence than addition.");
        System.out.println("So a + b * c means: a + (b * c)");
        System.out.println("But (a + b) * c forces addition before multiplication.");

        scanner.close();
    }
}

