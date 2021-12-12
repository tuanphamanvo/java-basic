package lesson9.HomeWorkDay9_Salary;

public class Employee {
    protected double salary;
    protected double supportSalary;

    public Employee(double salary, double supportSalary) {
        this.salary = salary;
        this.supportSalary = supportSalary;
    }

    public double getSalary() {
        return salary;
    }

    public double getSupportSalary() {
        return supportSalary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setSupportSalary(double supportSalary) {
        this.supportSalary = supportSalary;
    }
}
