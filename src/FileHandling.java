public class FileHandling {

    public String osName = "";
    public String filePath = "";
    public boolean isFileExist = false;

    public void handleFile(String textToWrite){
        OSDetector oSDetector = new OSDetector();
        osName = oSDetector.getOSName();

        FilePath pathSetter = new FilePath(osName);
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
