public class Day14 {

            static class Student {
                String name;
                int age;
                int regno;

                Student(Builder builder) {
                    this.name = builder.name;
                    this.age = builder.age;
                    this.regno = builder.regno;
                }

                static class Builder {
                    private String name;
                    private int age;
                    private int regno;

                    public Builder name(String nameValue) {
                        this.name = nameValue;
                        return this;
                    }

                    public Builder age(int ageValue) {
                        this.age = ageValue;
                        return this;
                    }

                    public Builder regno(int regnoValue) {
                        this.regno = regnoValue;
                        return this;
                    }

                    public Student build() {
                        return new Student(this);
                    }
                }
            }

            public static void main() {

                Student student = new Student.Builder()
                        .name("srinithi")
                        .age(18)
                        .regno(1234567)
                        .build();
                System.out.println(student.name);
               System.out.println(student.age);
               System.out.println(student.regno);
    }
}