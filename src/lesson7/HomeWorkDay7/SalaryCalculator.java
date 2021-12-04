package lesson7.HomeWorkDay7;

import lesson7.HomeWorkDay7.TotalSalaryByRole;

public class SalaryCalculator {
    public static void main(String[] args) {

        double totalStandardEmployeeSalary = TotalSalaryByRole.totalMonthlySalary(EmployeeType.STANDARD, 7);
        double totalManagerSalary = TotalSalaryByRole.totalMonthlySalary(EmployeeType.MANAGER,2);
        double totalCEOSalary = TotalSalaryByRole.totalMonthlySalary(EmployeeType.CEO, 1);
        double totalSalary = totalStandardEmployeeSalary+totalManagerSalary+totalCEOSalary;
        System.out.println("This monthly total salary: " + totalSalary);

    }

}
