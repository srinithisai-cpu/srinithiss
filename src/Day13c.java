import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Day13c {
    static void main() {
        Path path = Path.of("files", "student.csv");
        try {
            List<String> students = Files.readAllLines(path);

            for (String line : students) {
                String[] row = line.split(",");
                for (int i = 0; i < row.length; i++) {
                    System.out.print(row[i] + " | ");
                }
                System.out.println();
            }
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
}
