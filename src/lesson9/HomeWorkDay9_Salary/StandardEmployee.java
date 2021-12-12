package lesson9.HomeWorkDay9_Salary;

public class StandardEmployee extends Employee{
    private static final double startSalary = 30;
    private static final double supportSalary = 5;

    public StandardEmployee(double salary, double supportSalary) {
        super(salary, supportSalary);
    }

    public StandardEmployee(){
        super(startSalary,supportSalary);
    }
}
