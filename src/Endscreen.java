import java.util.Scanner;

public class Endscreen {
    public void chooseNextOption() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nWould you like to continue running program?");
            System.out.println("1. Yes");
            System.out.println("2. No");

            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                return;
            } else {
                
            }
            
        } while (choice != 2);

        scanner.close();
    }
}
//TODO: To delete or to futher implementation.
//* It's not connected, safe to delete