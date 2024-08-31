import java.io.*;

public class LineRemover {

    public void removeLine(String filePath, int lineNumber) {
        File inputFile = new File(filePath);
        File tempFile = new File("/home/tssdock/Documents/tempFile.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            PrintWriter writer = new PrintWriter(new FileWriter(tempFile))) {

            String currentLine;
            int currentLineNumber = 1;

            while ((currentLine = reader.readLine()) != null) {
                // Only write the line to the temp file if it's not the line to remove
                if (currentLineNumber != lineNumber) {
                    writer.println(currentLine);
                }
                currentLineNumber++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Delete the original file
        if (!inputFile.delete()) {
            System.out.println("Could not delete the original file.");
            return;
        }

        // Rename the temporary file to the original file name
        if (!tempFile.renameTo(inputFile)) {
            System.out.println("Could not rename the temporary file.");
        }
    }
}
