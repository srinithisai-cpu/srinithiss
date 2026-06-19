
import java.util.HashSet;
import java.util.Set;

public class Day11e {
    public static void main(String[] args) {

        Set<String>set=new HashSet<>();
        set.add("student1");
        set.add("student2");
        set.add("student1");
        set.add("student2");
        set.add("student1");
        set.add("student2");
        set.add("student1");
        for (String s : set)
            System.out.println(s);
    }

}
