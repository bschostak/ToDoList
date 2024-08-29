public class OSDetector {

    public String getNameOfOS() {
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            return "Windows";
        } else if (os.contains("mac")) {
            return "macOS";
        } else if (os.contains("nix") || os.contains("nux") || os.contains("aix")) {
            return "Unix/Linux";
        } else {
            System.out.println("Operating System: " + os);
            return null;
        }
    }
}
