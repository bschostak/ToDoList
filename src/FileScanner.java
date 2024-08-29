import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileScanner {

    public FileScanner() {

    }

    public void readFileContent() {
        String filePath = "/home/tssdock/Documents/ToDo.txt"; // Replace with your file path //TODO: pull file path from FileHandler
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            int lineNumber = 1; // Start line numbering from 1
            while ((line = br.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}