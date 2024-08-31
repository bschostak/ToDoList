import java.util.Scanner;
import java.util.InputMismatchException;

public class userChoice {
    public int validateInput() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        boolean validInput = false;

        while (!validInput) {
            System.out.print("Please enter your choice (1-4): ");
            try {
                choice = scanner.nextInt();
                validInput = true; 
                return choice;
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input. Please enter a valid integer.\n");
                scanner.next(); // Clear the invalid input
            }
        }

        scanner.close();
        return choice;
    }
}
