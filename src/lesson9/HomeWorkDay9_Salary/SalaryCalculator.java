package lesson9.HomeWorkDay9_Salary;

import java.util.List;

public class SalaryCalculator {
    public static double totalSalary(List<Employee> employeeList){
        double totalSalary = 0;
        for(Employee employee: employeeList){
            totalSalary = totalSalary + employee.salary + employee.supportSalary;
        }
        return totalSalary;
    }
}
