package task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Task 2: The Polymorphism Test.
 * A single List<Employee> holds both Developer and SalesManager objects.
 * Calling emp.calculatePay() runs a different formula for each one, decided
 * at runtime based on the object's actual type - not its declared type.
 */
public class Main {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Developer("Ahmed", 50000, 8000));
        employees.add(new SalesManager("Sara", 40000, 200000, 0.05));
        employees.add(new Developer("Hamza", 55000, 7000));

        for (Employee emp : employees) {
            System.out.println(emp.getName() + "'s final pay: " + emp.calculatePay());
        }
    }
}
