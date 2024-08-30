import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int choice;
        String userInput;

        FileHandler fileHandler = new FileHandler();

        do {
            System.out.println("Menu:");
            System.out.println("1. Display list");
            System.out.println("2. Add item");
            System.out.println("3. Remove item");
            System.out.println("4. Quit");
            System.out.print("Please enter your choice (1-4): ");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            //TODO: Check if userinput is integer
            //TODO: Check if userinput is tab or space

            switch (choice) {
                case 1:
                    System.out.println("\nYou selected Option 1.");
                    System.out.println("--------------------------------");
                    System.out.println("List of items:");
                    FileScanner fileScanner = new FileScanner();
                    fileScanner.readFileContent(fileHandler.getFilePath());
                    break;
                case 2:
                    System.out.println("\nYou selected Option 2.");
                    System.out.print("\nValue: ");
                    userInput = scanner.nextLine();
                    
                    FileExistanceCheck fileChecker = new FileExistanceCheck();
                    fileChecker.checkFileExistance(fileHandler.getFilePath());

                    FileSaver fileSaver = new FileSaver(fileHandler.getFilePath());
                    fileSaver.saveToFile(userInput);
                    System.out.println("--------------------------------");
                    break;
                case 3:
                    System.out.println("\nYou selected Option 3.");
                    System.out.print("\nValue: ");
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

//TODO: Update the Graph.
//TODO: Add colors to menu.