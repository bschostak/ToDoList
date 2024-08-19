import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileEditor{
    public void editFile(String textToWrite, String fileName){
        // Bool set to true allows you to add text to the end of the file without overwriting its existing contents.
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName, true))) {
            fileWriter.write(textToWrite);
            fileWriter.newLine();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
