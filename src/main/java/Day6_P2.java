public class Day6_P2{
    public static class student{
        String name;
        int regNo;
        String dept;
        int maths, physics, cs;

        student(String name, int regNo, String dept, int maths, int physics, int cs) {
            this.name = name;
            this.regNo = regNo;
            this.dept = dept;
            this.maths = maths;
            this.physics = physics;
            this.cs = cs;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Register No: " + regNo);
            System.out.println("Department: " + dept);
            System.out.println("Maths Mark: " + maths);
            System.out.println("Physics Mark: " + physics);
            System.out.println("CS Mark: " + cs);

            int total = maths + physics + cs;
            System.out.println("Total Marks: " + total);
        }
    }
    public static void main(String[] args) {
        student s1 = new student("srinithi", 12345, "B.Sc Statistics", 90, 85, 95);
        s1.display();
    }
}