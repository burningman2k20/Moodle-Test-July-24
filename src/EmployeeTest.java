public class EmployeeTest {
    public static void main(String[] args){
        Employee employee1 = new Employee("Joe", "Fresh", 14.00);
        Employee employee2 = new Employee("James", "Holden", 19.00);

        employee1.displayEmployee();
        System.out.printf("\n");
        employee2.displayEmployee();
    }
}

