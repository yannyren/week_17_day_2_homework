package example.codeclan.com.employeestartpoint;

/**
 * Created by yanren on 31/10/2017.
 */

public class Manager extends Employee {
    private String deptName;
//    int id;
//    String name;
//    String socialSecurityNumber;
//    double salary;


    public Manager(int id, String name, String socialSecurityNumber, double salary, String deptName) {
        super(id, name, socialSecurityNumber, salary);
        this.deptName = deptName;
    }


    public String getDeptName() {
        return this.deptName;
    }
}
