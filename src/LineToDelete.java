import java.util.Scanner;

public class LineToDelete {

    public void chooseLineToDelete(String filePath) {
        FileScanner fileScanner = new FileScanner();
        fileScanner.readFileContent(filePath);
        System.out.println("--------------------------------");
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the line number to delete: ");
        int lineNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        LineRemover lineRemover = new LineRemover();
        lineRemover.removeLine(filePath, lineNumber);

        scanner.close();
    }
}
