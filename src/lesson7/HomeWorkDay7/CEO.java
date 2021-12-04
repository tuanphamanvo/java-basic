package lesson7.HomeWorkDay7;

public class CEO {
    private double salary;
    private double supportSalary;

    public CEO(double salary, double supportSalary){
        this.salary = salary;
        this.supportSalary = supportSalary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSupportSalary() {
        return supportSalary;
    }

    public void setSupportSalary(double supportSalary) {
        this.supportSalary = supportSalary;
    }
}
