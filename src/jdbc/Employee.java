package jdbc;

public class Employee {
    private Integer employeeId;
    private String employeeName;
    private Integer employeeSalary;

    public Employee() {
    }

    public Employee(Integer employeeId, String employeeName, Integer employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeSalary = employeeSalary;
        System.out.println("all args constructor");
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public Integer getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(Integer employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeSalary=" + employeeSalary +
                '}';
    }
    {
        System.out.println("instance block");
    }
    static {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1,"Sam",10000);
        System.out.println(employee);

    }

}
