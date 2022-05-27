package buoi004;

public class NewMain {
    public static void main(String[] args) {
        Employee employee01 = new Employee(111, "A", "Nguyen");
        EmployeeNode employeeNode01 = new EmployeeNode(employee01);
        Employee employee02 = new Employee(222, "B", "Nguyen");
        EmployeeNode employeeNode02 = new EmployeeNode(employee02);
        Employee employee03 = new Employee(333, "C", "Nguyen");
        EmployeeNode employeeNode03 = new EmployeeNode(employee03);
        employeeNode01.setNext(employeeNode02);
        employeeNode02.setNext(employeeNode03);
        System.out.println(""+employeeNode01);
        System.out.println(""+employeeNode02);
        System.out.println(""+employeeNode03);
    }
}
