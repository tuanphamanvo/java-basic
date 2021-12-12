package lesson9.HomeWorkDay9_Salary;

public class CEO extends Employee{
    private static final double startSalary = 100;
    private static final double supportSalary = 0;

    public CEO(double salary, double supportSalary) {
        super(salary, supportSalary);
    }

    public CEO(){
        super(startSalary,supportSalary);
    }
}
