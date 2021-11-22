package lesson7.salary;

import java.util.ArrayList;
import java.util.List;

public class SalaryCalculator {
    public static double totalSalary(List<StandardEmployee> standardEmployeeList){
        //Loop over the list -> add: salary and support salary
        double totalSalary = 0;
        for (StandardEmployee employee: standardEmployeeList) {
            double monthlyEmployeeSalary = employee.getSalary() + employee.getSupportSalary();
            totalSalary = totalSalary+monthlyEmployeeSalary;
        }
        return totalSalary;

    }

    public static void main(String[] args) {
        List<StandardEmployee> standardEmployeeList = new ArrayList<>();
        StandardEmployee teo = new StandardEmployee(15.5, 1.0);
        StandardEmployee ti = new StandardEmployee(15.5, 1.0);
        standardEmployeeList.add(teo);
        standardEmployeeList.add(ti);
        double totalSalary = SalaryCalculator.totalSalary(standardEmployeeList);
        System.out.println(totalSalary);
        ti.setSupportSalary(2);
        totalSalary = SalaryCalculator.totalSalary(standardEmployeeList);
        System.out.println(totalSalary);
    }
}
