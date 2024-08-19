import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choice;

        FileHandling fileHandler = new FileHandling();

        do {
            System.out.println("Menu:");
            System.out.println("1. Display list");
            System.out.println("2. Add item");
            System.out.println("3. Remove item");
            System.out.println("4. Quit");
            System.out.print("Please enter your choice (1-4): ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nYou selected Option 1.");
                    break;
                case 2:
                    System.out.println("\nYou selected Option 2.");
                    System.out.print("\nValue: ");
                    String userInput = scanner.nextLine();
                    fileHandler.writeToFile(userInput);
                    System.out.println("\nAdded '" + userInput + "'.\n");
                    System.out.println("--------------------------------");
                    break;
                case 3:
                    System.out.println("\nYou selected Option 3.");
                    break;
                case 4:
                    System.out.println("\nExiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
                    break;
            }
            System.out.println();
        } while (choice != 4);

        scanner.close();
    }
}
//TODO: Make OS detector seprable variable, that is always checked by selecting option from a menu.