public class FileHandler {

    private String osName;
    private String filePath;
    private boolean isFileExist;

    public FileHandler() {
        this.osName = "";
        this.filePath = "";
        this.isFileExist = false;
    }
    
    public FileHandler(String filePath) {
        this.filePath = filePath;
    }

    public void handleFile(String textToWrite){
        OSDetector oSDetector = new OSDetector();
        osName = oSDetector.getNameOfOS();

        FilePath pathSetter = new FilePath();
        //System.out.println("OS Name in pathSetter: '" + pathSetter.getOsName()+"'");
        pathSetter.setOsName(osName); //LEARN: What is this?
        //System.out.println("OS Name in pathSetter: '" + pathSetter.getOsName()+"'");

        filePath = pathSetter.setPathToFile();
        if (filePath == null) {
            System.out.println("Error: Unsupported operating system.");
            return;
        }

        FileExistanceCheck fileChecker = new FileExistanceCheck(filePath);
        isFileExist = fileChecker.checkFileExistance();

        FileSaver fileEditor = new FileSaver(filePath);
        fileEditor.saveToFile(textToWrite);
        if (!isFileExist) {
            System.out.println("\nSuccessfully wrote to file: " + filePath);
        }
        else {
            System.out.println("\nSuccessfully appended to file: " + filePath);
        }
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

}
