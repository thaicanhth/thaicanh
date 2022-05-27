package buoi04;

import buoi003.Animali;
import buoi003.EmployeeNode;

public class EmployeeLinkedList {
    private EmployeeNode head=null;
    private int size= 0;
    public void addFirst(Animali employee){
        EmployeeNode newNode = new EmployeeNode(employee);
    head=newNode;
    size++;
    }
    public EmployeeNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }
    public void printList()
    {
        EmployeeNode current= head;
        System.out.println("HEAD->");
        while (current!=null){
            System.out.println(""+current);
            System.out.println("->");
            current=current.getNext();
        }
        System.out.println("NULL");
    }
    public int getSize(){
        return size;
    }
    public void setSize(int size){
        this.size=size;
    }
    public boolean isEmpty()
    {
        return head==null;
    }
}
