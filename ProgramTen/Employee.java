//Maranatha Smith
//Java Programming
//May 2, 2020
//Edit: February 22, 2021
//Employee sub class to the Person Super class
public class Employee extends Person {
    //private variables for the employee ID, department, and years served.
    private int employeeID;
    private String employeeDepartment;
    private int yearsOfService;
    //public methods to access the private variables of the Employee class.
    public int getEmployeeID() {
        return employeeID;
    }
    public String getEmployeeDepartment() {
        return employeeDepartment;
    }
    public int getYearsOfService() {
        return yearsOfService;
    }
    public void setEmployeeID(int empID) {
        employeeID = empID;
    }
    public void setEmployeeDepartment(String empDepart) {
        employeeDepartment = empDepart;
    }
    public void setYearsOfService(int yearsServ) {
        yearsOfService = yearsServ;
    }
}
