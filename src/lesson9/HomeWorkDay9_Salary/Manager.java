package lesson9.HomeWorkDay9_Salary;

public class Manager extends Employee {
    private static final double startSalary = 50;
    private static final double supportSalary = 3;

    public Manager(double salary, double supportSalary) {
        super(salary, supportSalary);
    }

    public Manager(){
        super(startSalary,supportSalary);
    }
}
