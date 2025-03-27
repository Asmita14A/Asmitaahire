import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter a character: ");
        char ch = scanner.next().toLowerCase().charAt(0); // Convert to lowercase for easy comparison

        // Check if the character is a vowel or consonant
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a vowel.");
        } else if ((ch >= 'a' && ch <= 'z')) { // Check if it's an alphabet letter
            System.out.println(ch + " is a consonant.");
        } else {
            System.out.println("Invalid input! Please enter an alphabet letter.");
        }

        // Close the scanner
        scanner.close();
    }
}