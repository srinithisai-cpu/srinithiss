import java.util.HashMap;
import java.util.Map;

public class Day_11e {
    public static void main(String[] args) {
        Map<String, Object> person = new HashMap<>();
        person.put("ram", 89);
        person.put("jhon", 78);
        person.put("aravindh",67);
        person.put("viky", 90);

        System.out.println(person.get("ram"));
        person.entrySet().forEach(entry ->
                System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}

