package buoi003;

public class EmployeeNode {
    private Animali employee;
    private EmployeeNode next;

    public EmployeeNode() {
    }

    public EmployeeNode(Animali employee) {
        this.employee = employee;
    }

    public EmployeeNode(Animali employee, EmployeeNode next) {
        this.employee = employee;
        this.next = next;
    }

    public Animali getEmployee() {
        return employee;
    }

    public void setEmployee(Animali employee) {
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
        return "EmployeeNode{" + "employee=" + employee + '}';
    }
}
