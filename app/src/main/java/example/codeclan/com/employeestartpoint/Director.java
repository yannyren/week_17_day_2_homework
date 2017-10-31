package example.codeclan.com.employeestartpoint;

/**
 * Created by yanren on 31/10/2017.
 */

public class Director extends Manager {
    double budget;

    public Director(int id, String name, String socialSecurityNumber, double salary, String deptName, double budget) {
        super(id, name, socialSecurityNumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return this.budget;
    }
}
