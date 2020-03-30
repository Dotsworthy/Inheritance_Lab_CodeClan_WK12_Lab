package management;

public class Director extends Manager {

    private double budget;

    public Director(String name, int NINumber, double salary, String departmentName, double budget) {
        super(name, NINumber, salary, departmentName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }
}
