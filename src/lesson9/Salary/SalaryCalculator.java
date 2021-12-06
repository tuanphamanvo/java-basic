package lesson9.Salary;


public class SalaryCalculator {

    //Employee, qty
    static double getEmployeeTotalSalary (Object employeeObj, int qty){
        double totalSalary = 0;
        if(employeeObj.getClass().equals(CEO.class)){
            CEO ceo = (CEO) employeeObj;
            totalSalary = ceo.getSupportSalary() * qty;
        } else if (employeeObj.getClass().equals(Manager.class)){
            Manager manager = (Manager) employeeObj;
            totalSalary = manager.getSalary()*qty;
        }
            return totalSalary;
    }

    public static void main(String[] args) {
        CEO ceo = new CEO();
        Manager manager = new Manager();
        double ceoSalary = SalaryCalculator.getEmployeeTotalSalary(ceo,1);
        double managerSalary = SalaryCalculator.getEmployeeTotalSalary(manager, 10);
        System.out.println(ceoSalary + " " + managerSalary);

    }
}
