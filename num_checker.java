import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check whether the number is positive, negative, or zero
        if (number > 0) {
            System.out.println(number + " is a positive number.");
        } else if (number < 0) {
            System.out.println(number + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }

        // Close the scanner
        scanner.close();
    }
}