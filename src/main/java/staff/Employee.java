package staff;

public class Employee {

    private String name;
    private int NINumber;
    private double salary;

    public Employee(String name, int NINumber, double salary) {
        this.name = name;
        this.NINumber = NINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getNINumber() {
        return NINumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double amount) {
        this.salary += amount;
    }

    public double payBonus() {
        double bonus;
        bonus = this.salary / 100;
        return bonus;
    }
}
