package lesson7.HomeWorkDay7;


public class TotalSalaryByRole {
    double totalSalary = 0;
    public static final double standardEmployeeSalary = 30;
    public static double standardEmployeeSupportSalary = 5;
    public static double managerSalary = 50;
    public static double managerSupportSalary = 3;
    public static double ceoSalary = 100;
    public static double ceoSupportSalary = 0;

    private static double promotedSalary4StandardEmployee = 15;
    private static double promotedSupportSalary4StandardEmployee = 1;

    private static double numberOfPromotedStandardEmployee = 1;



    public static double totalMonthlySalary(EmployeeType role, int qty) {
        double totalMonthlySalaryByRole =0;
        switch (role) {
            case STANDARD:
                StandardEmployee standardEmployee = new StandardEmployee(standardEmployeeSalary, standardEmployeeSupportSalary);
                totalMonthlySalaryByRole = ((standardEmployeeSalary + standardEmployeeSupportSalary) * qty) + (promotedSalary4StandardEmployee+promotedSupportSalary4StandardEmployee)*numberOfPromotedStandardEmployee;
                break;
            case MANAGER:
                Manager manager = new Manager(managerSalary, managerSupportSalary);
                totalMonthlySalaryByRole = (managerSalary + managerSupportSalary) * qty;
                break;
            case CEO:
                CEO ceo = new CEO(ceoSalary, ceoSupportSalary);
                totalMonthlySalaryByRole = (ceoSalary + ceoSupportSalary) * qty;
                break;
            default:
                System.out.println("No matched role!!!");
        }
        return totalMonthlySalaryByRole;

    }
}
