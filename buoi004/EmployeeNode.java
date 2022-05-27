package buoi004;

public class EmployeeNode {
    private Employee employee;
    private EmployeeNode next = null;

    public EmployeeNode() {
    }

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "EmployeeNode{" + "employee=" + employee + ", next=" + next + '}';
    }
}
