package buoi06;

public class Employee {
    private String lastName;
    private String firstName;
    private int id;
    public Employee() {
    }
    public Employee(String lastName, String firstName, int id) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.id = id;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Employee{" + "lastName=" + lastName + ", firstName=" + firstName + ", id=" + id + '}';
    }
}

