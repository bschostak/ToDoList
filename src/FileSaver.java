import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileSaver extends FileHandler{
    //TODO: Check if I really need this
    private String filePath;
    public FileSaver(String filePath) {
        super(filePath);
        this.filePath = filePath;
    }

    public void saveToFile(String textToWrite){
        // Bool set to true allows you to add text to the end of the file without overwriting its existing contents.
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(filePath, true))) {
            fileWriter.write(textToWrite);
            fileWriter.newLine();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}