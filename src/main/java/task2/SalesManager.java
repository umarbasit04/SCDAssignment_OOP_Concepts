package task2;

public class SalesManager extends Employee {

    private double salesAmount;
    private double commissionRate; // e.g. 0.05 means 5%

    public SalesManager(String name, double baseSalary, double salesAmount, double commissionRate) {
        super(name, baseSalary);
        this.salesAmount = salesAmount;
        this.commissionRate = commissionRate;
    }

    @Override
    public double calculatePay() {
        double commission = salesAmount * commissionRate;
        return baseSalary + commission;
    }
}
