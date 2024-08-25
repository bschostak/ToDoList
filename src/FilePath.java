public class FilePath extends FileHandling {
    //LEARN: Why do I need this constructor.
    FilePath(String osName) {
        super.osName = osName;
    }

    public String setFilePath() {
        String userName = System.getProperty("user.name");
        switch (osName) {
            case "Windows":
                return "C:/Users/" + userName + "/Documents/ToDo.txt";
            case "macOS":
                return "/Users/" + userName + "/Documents/ToDo.txt";
            case "Unix/Linux":
                return "/home/" + userName + "/Documents/ToDo.txt";
            default:
                return null;
        }
    }
}
