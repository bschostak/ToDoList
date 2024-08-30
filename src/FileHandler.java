public class FileHandler {

    private String osName;
    private String filePath;

    public FileHandler() {
        checkFile();
    }

    public FileHandler(String filePath) {
        this.filePath = filePath;
    }

    //TODO: Make a abstract class for everything in this method
    private void checkFile() {
        OSDetector oSDetector = new OSDetector();
        osName = oSDetector.getNameOfOS();

        FilePath pathSetter = new FilePath();
        filePath = pathSetter.setPathToFile(osName);
        if (filePath == null) {
            System.out.println("Error: Unsupported operating system.");
            System.exit(1);
        }
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getOsName() {
        System.out.println(osName);
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }
}
