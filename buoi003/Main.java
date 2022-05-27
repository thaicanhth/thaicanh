package buoi003;

public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animali e01 = new Animali(111, "A", "Thi");
        Animali e02 = new Animali(222, "B", "Tran");
        Animali e03 = new Animali(333, "C", "Vo");
        Animali e04 = new Animali(444, "D", "Pham");
        Animali e05 = new Animali(555, "E", "Thai");
        EmployeeLinkedList list = new EmployeeLinkedList();
        System.out.println("" + list.isEmpty());
        list.addFirst(e01);
        list.addFirst(e02);
        list.addFirst(e03);
        list.addFirst(e04);
        list.addFirst(e05);
        System.out.println("" + list.getSize());
        list.printList();
    }
}
