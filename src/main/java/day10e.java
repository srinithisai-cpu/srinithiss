import java.util.LinkedList;
   public class day10e {
    static void process(LinkedList<String> list) {
        System.out.println("Removed : " + list.removeFirst());
    }
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("101 -archana- 99");
        list.add("102 - subadhanu - 87");
        list.add("103 - kanish - 94");
        list.add("104 - yasci - 97");
        list.add("105 - nandh - 91");
        System.out.println("Student List:");
        System.out.println(list);
        list.add("106 -dhivya- 98");
        System.out.println("\nAfter Adding:");
        System.out.println(list);
        process(list);
        System.out.println("\nAfter Removing:");
        System.out.println(list);
        list.set(2, "104 - yasci - 97");
        System.out.println("\nAfter Updating:");
        System.out.println(list);
    }
}
