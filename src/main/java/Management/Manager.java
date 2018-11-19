package Management;

import Staff.Employee;

public class Manager extends Employee {

    private String deptName;

    public Manager(String deptName, String name, int niNumber, double salary) {
        super(name, niNumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
