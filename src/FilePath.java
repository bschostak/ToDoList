public class FilePath extends FileHandler {
    

    public String setPathToFile() {
        String userName = System.getProperty("user.name");
        switch (getOsName()) {
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
