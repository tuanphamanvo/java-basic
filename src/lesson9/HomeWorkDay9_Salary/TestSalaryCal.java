package lesson9.HomeWorkDay9_Salary;

import lesson2.Array;

import java.util.ArrayList;
import java.util.List;

public class TestSalaryCal {
    public static void main(String[] args) {
        Manager tom = new Manager();
        Manager jerry = new Manager(55, 5);
        Employee teo = new StandardEmployee();
        Employee ti = new StandardEmployee(33,3);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(teo);
        employeeList.add(ti);
        employeeList.add(jerry);
        teo.setSalary(11);
        double totalSalary = SalaryCalculator.totalSalary(employeeList);
        System.out.println(totalSalary);

    }
}
