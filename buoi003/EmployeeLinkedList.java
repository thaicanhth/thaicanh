package buoi003;

public class EmployeeLinkedList {
    private EmployeeNode head = null;
    private int size = 0;

    public EmployeeLinkedList() {
    }

    // THem 1 phan tu vao dau danh sach
    public void addFirst(Animali employee) {
        // Buoc 1: Tao phan tu moi
        EmployeeNode newNode = new EmployeeNode(employee);
        // Buoc 2: Lay tay cua phan tu moi, noi vao danh sach
        newNode.setNext(head);
        // Buoc 3: Lay head gan vao phan tu moi
        head = newNode;
        // Buoc 4: Tang kich co len 1
        size++;

    }

    public void printList() {
        EmployeeNode current = head;
        while (current != null) {
            System.out.println("" + current.toString());
            System.out.println(" -> ");
            current = current.getNext();
        }
        System.out.println("NULL");
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
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
}
