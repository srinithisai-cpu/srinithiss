public class Day8 {
    record CourseRecord(String name, String dept) {

    }

    void main() {
        CourseRecord courserecord = new CourseRecord("java programming", "artificial intelligence");
        System.out.println(courserecord.name());
        System.out.println(courserecord.dept());

    }
}