package buoi004;

public class Main {
    public static void main(String[] args) {
        Employee employee01 = new Employee(111, "A", "Nguyen");
        Employee e01 = new Employee(111, "A", "Ly");
        Employee e02 = new Employee(222, "B", "Tran");
        Employee e03 = new Employee(333, "C", "Nguyen");
        Employee e04 = new Employee(444, "D", "Pham");
        Employee e05 = new Employee(555, "E", "Van");
        Employee e06 = new Employee(666, "Z", "Ly");
        EmployeeLinkedList list = new EmployeeLinkedList();
        System.out.println("" + list.isEmpty());
        list.addFirst(e01);
        list.addFirst(e02);
        list.addFirst(e03);
        list.addFirst(e04);
        list.addFirst(e05);

        System.out.println("" + list.getSize());
        list.printList();
        list.removeFromFront();
        list.printList();
        list.addToTail(e06);
        list.deleteFromTail();
        list.printList();
    }
}
