public class Employee {
    int empId;
    String name;

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }


    String generateEmail() {
        return name.toLowerCase().replace(" ", "") + "@company.com";
    }

    void displayInfo() {
        System.out.println("ID: " + empId + " | Name: " + name);
        System.out.println("Email: " + generateEmail());
    }
}

    class Manager extends Employee {
        String department;

        Manager(int empId, String name, String department) {
            super(empId, name);
            this.department = department;
        }


        @Override
        String generateEmail() {
            String cleanName = name.toLowerCase().replace(" ", "");
            String cleanDept = department.toLowerCase().replace(" ", "");
            return cleanName + "." + cleanDept + "@company.com";
        }
    }

    public class EmployeeSystem {
        public static void main(String[] args) {
            Employee emp = new Employee(101, "Alice Smith");
            Manager mgr = new Manager(201, "Bob Jones", "Sales");

            System.out.println("--- Employee ---");
            emp.displayInfo();

            System.out.println("\n--- Manager ---");
            mgr.displayInfo();
        }
    }

