import java.nio.file.*;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class LineReader {
    public void convertLinesToStings() {
        try {
            List<String> lines = Files.lines(Paths.get("path/to/your/file.txt")).collect(Collectors.toList());

            // Print the lines
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//TODO: Learn Java lists.
//* Not connected to other classes, safe to remove.