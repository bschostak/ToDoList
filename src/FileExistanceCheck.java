import java.io.File;

public class FileExistanceCheck extends FileHandling {

    FileExistanceCheck(String filePath) {
        super.filePath = filePath;
    }
    
    public Boolean checkFileExistance() {
        File file = new File(filePath);

        if (file.exists()) {
            return true;
        } else {
            return false;
        }
    }
}
