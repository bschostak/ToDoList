import java.io.File;

public class FileExistanceCheck extends FilePath {
    public Boolean checkFileExistance(String path) {
        File file = new File(path);

        if (file.exists()) {
            return true;
        } else {
            return false;
        }
    }
}
