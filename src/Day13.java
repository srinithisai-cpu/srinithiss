import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Day13 {
    static void main() {
        Path path = Path.of("files","report.txt");


        try{
            List<String> data = Files.readAllLines(path);

            for (String line : data) {
                System.out.println(line);
            }

            List<String> newData = new ArrayList<>();
            newData.add("Student1");
            newData.add("Student2");
            newData.add("Student3");
            newData.add("Student4");
            newData.add("Student5");

        } catch (IOException io){
            io.printStackTrace();
            System.out.println("Error reading file");
        }
    }

}