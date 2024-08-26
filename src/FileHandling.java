public class FileHandling {

    private String osName;
    private String filePath;
    private boolean isFileExist;

    public FileHandling() {
        this.osName = "";
        this.filePath = "";
        this.isFileExist = false;
    }

    public FileHandling(String filePath) {
        this.filePath = filePath;
    }

    public String getFilePath() {
        System.out.println(filePath);
        return filePath;
    }

    public String getOsName() {
        System.out.println(osName);
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void handleFile(String textToWrite){
        OSDetector oSDetector = new OSDetector();
        osName = oSDetector.getOSName();

        FilePath pathSetter = new FilePath();
        pathSetter.setOsName(osName);

        filePath = pathSetter.setFilePath();
        
        if (filePath == null) {
            System.out.println("Error: Unsupported operating system.");
            return;
        }

        FileExistanceCheck fileChecker = new FileExistanceCheck(filePath);
        isFileExist = fileChecker.checkFileExistance();


        FileEditor fileEditor = new FileEditor(filePath);
        fileEditor.editFile(textToWrite);
        if (!isFileExist) {
            System.out.println("\nSuccessfully wrote to file: " + filePath);
        }
        else {
            System.out.println("\nSuccessfully appended to file: " + filePath);
        }
    }
}
