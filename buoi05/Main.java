package buoi05;

public class Main {
    public static void main(String[] args) {
        Employee emp01 = new Employee("A", "Nguyen", 111);
        Employee emp02 = new Employee("B", "Nguyen", 222);
        Employee emp03 = new Employee("C", "Nguyen", 333);
        Employee emp04 = new Employee("D", "Nguyen", 444);
        Employee emp05 = new Employee("E", "Nguyen", 555);
        ArrayStack arrayStack = new ArrayStack(10);
        arrayStack.push(emp01);
        arrayStack.push(emp03);
        arrayStack.push(emp04);
        arrayStack.push(emp05);
        arrayStack.printStack();
        System.out.println("=================");
        System.out.println(arrayStack.peek());
        System.out.println("=================");
        System.out.println("Popped: " + arrayStack.pop());
        System.out.println(arrayStack.peek());
        System.out.println("====================");
        arrayStack.printStack();
    }
}
