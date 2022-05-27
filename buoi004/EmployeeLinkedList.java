package buoi004;

public class EmployeeLinkedList {
    private EmployeeNode head = null;
    private int size = 0;

    public void addFirst(Employee employee) {
        // create the new Node
        EmployeeNode newNode = new EmployeeNode(employee);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    // Them vao duoi, co nghia rang them 1 phan tu vao tail
    public void addToTail(Employee e) {
        // em co e, tao ra new node
        EmployeeNode newNode = new EmployeeNode(e);
        EmployeeNode current = head;
        EmployeeNode tail = null;
        // Neu list chua co node
        // node moi them chinh la head -> ba chu
        if (isEmpty()) {
            head = newNode;
        } else {// Co node
            // Dung 1 vong de di bo den cuoi hanh lang
            // Hay con goi la duyet den phan tu cuoi cung cua ll
            while (current != null) {
                // Chot phan tu truoc null
                tail = current;
                current = current.getNext();
            }
            // tail chinh la ong D
            tail.setNext(newNode);
            tail = newNode;// mean newNode tro thanh Tail
        }

    }
    // Xoa 1 node tu dau cua danh sach

    public EmployeeNode removeFromFront() {
        // List bi empty-> khong co node de remove
        if (isEmpty()) {
            return null;
        }
        // Lay node dau tien, noi rang node no chuan bi remove
        EmployeeNode removedNode = head;
        // Coi nhu chi lay nguoi ke nhiem cua head: head.next
        head = head.getNext();
        // giam kich co cua ll
        size--;
        // Coi lai cai node removedNode
        removedNode.setEmployee(null);
        return removedNode;

    }

    // Now remove from the tail
    public EmployeeNode deleteFromTail() {
        EmployeeNode current = head;
        EmployeeNode nodeBeforeTail = null;
        // check the list is empty
        if (isEmpty()) {
            return null;
        } else if (head.getNext() == null) {// list Chua 1 node
            head = null; // remove the head
        } else {
            // Di bo cho den phan tu cuoi cung
            while (current != null) {
                nodeBeforeTail = current;
                current = current.getNext();

            }
            nodeBeforeTail.setNext(null);// co nghia
            // truoc day han gan voi phan cuoi cung
            // chu ngan nhay qua phan qua cuoi cung
            // gan len null
            // phan tu cuoi cung ra di khoi lich

        }
        return current;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {

            System.out.println("" + current);
            System.out.println(" -> ");
            current = current.getNext();
        }
        System.out.println("NULL");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return head == null;
    }
}