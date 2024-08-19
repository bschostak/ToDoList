public class FileHandling {
    public void writeToFile(String textToWrite){
        OSDetector oSDetector = new OSDetector();
        String osName = oSDetector.getOSName();

        FilePath pathSeter = new FilePath();
        String fileName = pathSeter.setFilePath(osName);

        FileExistanceCheck fileChecker = new FileExistanceCheck();
        boolean isFileExist = fileChecker.checkFileExistance(fileName);

        FileEditor fileEditor = new FileEditor();
        fileEditor.editFile(textToWrite, fileName);
        if (!isFileExist) {
            System.out.println("\nSuccessfully wrote to file: " + fileName);
        }
    }
}
