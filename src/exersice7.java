public class exersice7 {

    interface Employee {
        void solveProblem();
        void work();
    }

    static class BankEmployee implements Employee{
        String name;
        String id;
        int salary;

        BankEmployee(String name, String id, int salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        @Override
        public void solveProblem() {
            System.out.println(name + " is solving banking problems");
        }

        @Override
        public void work() {
            System.out.println(name + " is working in the bank");
        }
    }

    static class CheckingEmployee implements Employee {

        String name;
        String id;
        int salary;

        CheckingEmployee(String name, String id, int salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        @Override
        public void solveProblem() {
            System.out.println(name + " is checking customer accounts");
        }

        @Override
        public void work() {
            System.out.println(name + " is performing checking operations");
        }
    }

    public static void main(String[] args) {

        Employee emp1 = new BankEmployee("raja", "1111", 25000);
        Employee emp2 = new CheckingEmployee("rani", "2222", 35000);
        System.out.println("");
        emp1.work();
        System.out.println();
        emp1.solveProblem();
        System.out.println("");
        emp2.work();
        System.out.println();
        emp2.solveProblem();
        System.out.println("  ");

    }
}
