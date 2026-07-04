public class EmployeeManager {

    private Employee[] employees;
    private int count;

    public EmployeeManager(int size) {
        employees = new Employee[size];
        count = 0;
    }

    // Add Employee
    public void addEmployee(Employee employee) {

        if (count == employees.length) {
            System.out.println("Employee Array is Full.");
            return;
        }

        employees[count++] = employee;
        System.out.println("Employee Added Successfully.");
    }

    // Search Employee
    public Employee searchEmployee(int id) {

        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == id)
                return employees[i];
        }

        return null;
    }

    // Delete Employee
    public void deleteEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].getEmployeeId() == id) {

                for (int j = i; j < count - 1; j++)
                    employees[j] = employees[j + 1];

                employees[count - 1] = null;
                count--;

                System.out.println("Employee Deleted.");
                return;
            }
        }

        System.out.println("Employee Not Found.");
    }

    // Display Employees
    public void displayEmployees() {

        if (count == 0) {
            System.out.println("No Employees Available.");
            return;
        }

        System.out.println("-----------------------------------------------");
        System.out.printf("%-8s %-15s %-15s %s%n",
                "ID", "Name", "Position", "Salary");
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < count; i++)
            System.out.println(employees[i]);

        System.out.println("-----------------------------------------------");
    }
}