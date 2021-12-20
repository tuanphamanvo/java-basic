package lesson12;

import java.util.List;

public class SalaryCalculator {
    public static double totalSalary(List<IEmployee> IEmployeeList) {
        double totalSalary = 0;
        for (IEmployee IEmployee : IEmployeeList) {
            totalSalary = totalSalary + IEmployee.getSalary() + IEmployee.getSupportSalary();
        }
        return totalSalary;
    }
}
