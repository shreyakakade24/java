// Base class
class Employee {
    String name;
    String address;
    double salary;
    String jobTitle;

    public Employee(String name, String address, double salary, String jobTitle) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }

    public double calculateBonus() {
        return salary * 0.10; // Default bonus is 10%
    }

    public void generatePerformanceReport() {
        System.out.println("Performance report for " + name + " (" + jobTitle + ")");
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }

    public void manageProject(String projectName) {
        System.out.println(name + " is managing the project: " + projectName);
    }
}

// Manager subclass
class Manager extends Employee {
    public Manager(String name, String address, double salary) {
        super(name, address, salary, "Manager");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.20; // Managers get 20% bonus
    }

    @Override
    public void manageProject(String projectName) {
        System.out.println("Manager " + name + " is overseeing project: " + projectName);
    }
}

// Developer subclass
class Developer extends Employee {
    public Developer(String name, String address, double salary) {
        super(name, address, salary, "Developer");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.15; // Developers get 15% bonus
    }

    @Override
    public void manageProject(String projectName) {
        System.out.println("Developer " + name + " is coding for project: " + projectName);
    }
}

// Programmer subclass
class Programmer extends Employee {
    public Programmer(String name, String address, double salary) {
        super(name, address, salary, "Programmer");
    }

    @Override
    public double calculateBonus() {
        return salary * 0.12; // Programmers get 12% bonus
    }

    @Override
    public void manageProject(String projectName) {
        System.out.println("Programmer " + name + " is debugging in project: " + projectName);
    }
}

// Main class
public class hierchy {
    public static void main(String[] args) {
        Employee e1 = new Manager("Alice", "123 Manager Lane", 90000);
        Employee e2 = new Developer("Bob", "456 Dev Street", 80000);
        Employee e3 = new Programmer("Charlie", "789 Prog Ave", 70000);

        e1.generatePerformanceReport();
        System.out.println("Bonus: $" + e1.calculateBonus());
        e1.manageProject("Enterprise System");

        System.out.println();

        e2.generatePerformanceReport();
        System.out.println("Bonus: $" + e2.calculateBonus());
        e2.manageProject("Web Application");

        System.out.println();

        e3.generatePerformanceReport();
        System.out.println("Bonus: $" + e3.calculateBonus());
        e3.manageProject("Mobile App");
    }
}