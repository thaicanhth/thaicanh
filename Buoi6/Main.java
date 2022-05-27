package Buoi6;

public class Main {
    public static void main(String[] args) {
        Employee empBegin = new Employee("Begin", "Nguyen", 111);
        Employee emp02 = new Employee("A", "Nguyen", 222);
        Employee emp03 = new Employee("B", "Nguyen", 333);
        Employee emp04 = new Employee("C", "Nguyen", 444);
        Employee emp05 = new Employee("D", "Nguyen", 555);
        Employee empEnd = new Employee("End", "Nguyen", 666);

        MyArrayCircularQueue arrayQueue = new MyArrayCircularQueue(10);
        arrayQueue.addToBack(empBegin);
        arrayQueue.addToBack(emp02);
        arrayQueue.addToBack(emp03);
        arrayQueue.addToBack(emp04);
        arrayQueue.addToBack(emp05);
        arrayQueue.addToBack(empEnd);
        arrayQueue.printMyQueue();
        System.out.println("" + arrayQueue.getBack());
        System.out.println("" + arrayQueue.getFront());
        // Begin la phan tu vao dau tien

        System.out.println("Remove: " + arrayQueue.removeFromFront());
        System.out.println("" + arrayQueue.getBack());
        System.out.println("" + arrayQueue.getFront());
        // In ra van con Begin vi Peek lay ra coi
        // Lan nay mat Begin vi Remove da xoa
        arrayQueue.printMyQueue();
        // thoi code di nghe cac tinh yeu :-))))
    }
}
