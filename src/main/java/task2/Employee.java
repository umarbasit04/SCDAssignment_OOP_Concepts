package task2;

/**
 * Task 2: Base class for the inheritance/polymorphism exercise.
 */
public class Employee {

    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    // Base pay formula - subclasses override this to add their own extras.
    public double calculatePay() {
        return baseSalary;
    }
}
