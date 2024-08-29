import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileSaver extends FileHandler{
    //LEARN: Why do I need this constructor.
    public FileSaver(String filePath) {
        super(filePath);
    }
    
    public void saveToFile(String textToWrite){
        // Bool set to true allows you to add text to the end of the file without overwriting its existing contents.
        try (BufferedWriter fileWriter = new BufferedWriter(new FileWriter(getFilePath(), true))) {
            fileWriter.write(textToWrite);
            fileWriter.newLine();
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
// TODO: Add constructors.