package Management;

public class Director extends Manager{

    private double budget;

    public Director(String deptName, String name, int niNumber, double salary, double budget) {
        super(deptName, name, niNumber, salary);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double payBonus(){
        return getSalary()*0.2;
    }
}
