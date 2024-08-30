import java.io.File;

public class FileExistanceCheck {
    
    public void checkFileExistance(String filePath) {
        File file = new File(filePath);

        if (file.exists()) {
            System.out.println("\nAppended to file: " + filePath);
        } else {
            System.out.println("\nWritten to file: " + filePath);
        }
    }
}
