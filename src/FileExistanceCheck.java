import java.io.File;

public class FileExistanceCheck extends FileHandling {

    FileExistanceCheck(String filePath) {
        super(filePath);
    }
    
    public Boolean checkFileExistance() {
        File file = new File(getFilePath());

        if (file.exists()) {
            return true;
        } else {
            return false;
        }
    }
}
