package buoi06;

import java.util.NoSuchElementException;

public class ArrayQueue {
    private Employee[] myQueue;
    private int front = 0;// ban dau ko co ai vao, ai ra, nen chot =0
    private int back = 0;// ban dau ko co ai vao, ai ra, nen chot =0

    // HaM dung
    public ArrayQueue() {
    }

    public ArrayQueue(int capacity) {// quy tac bung bia: KHai bao toi da so chai bia uong duoc
        // xin cap phat bo nho cho myQueue
        myQueue = new Employee[capacity];
    }

    // Viet ham them 1 Employee vao hang doi: chu y them vao BACK ( xep hang thi dung dang sau)
    public void addToBack(Employee employee) {
        // Tuy nhien neu nhu hang Full khong the them nguoi nua thi sao
        // Nho quy tac Phinh Bung khi uong bia.
        if (back == myQueue.length) {
            // khai bao 1 mang moi, co kich co gap doi
            Employee[] newArray = new Employee[2 * myQueue.length];
            // sau do copy phan tu cua mang cu vao mang moi, leng phan tu
            System.arraycopy(myQueue, 0, newArray, 0, myQueue.length);
            // gan mang moi cho myQueue
            myQueue = newArray;// Sau buoc nay myQueue co bung bia moi de uong bia roi :-)))
        }
        // Sau do cu them vao tung chai bia thoi
        // Ban dau cu co nguoi xep hang thi tang Back len 1.
        myQueue[back] = employee;
        back++;
    }

    // Viet ham xoa han phan tu tu Front
    public Employee removeFromFront() {
        // Kiem tra neu khong co phan tu nao thi khong lay ra coi duoc
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        // Lay phan tu o Front
        Employee removedEmployee = myQueue[front];
        // Gan phan tu Front = NULL
        myQueue[front]=null;
        // tang front len 1
        front++;
        // Xu ly truong hop xoa het size()==0
        // reset lai front va back
        if (size()==0) {
            front=0;
            back=0;
        }

        return removedEmployee;
    }

    // Viet ham lay phan tu ra coi
    public Employee peekFromFront() {
        // Kiem tra neu khong co phan tu nao thi khong lay ra coi duoc
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        return myQueue[front];
    }

    // Viet ham in ra coi thu nghe
    public void printMyQueue() {
        // Back la so phan tu them vao (9)
        // Front so phan tu di ra (3)
        // Vay kich co la Back tru Front: 9-3= 6 nguoi trong queue
        // So nguoi vao luc mo cung lon hon hoac bang so nguoi ra
        for (int i = front; i < back; i++) {
            System.out.println("" + myQueue[i]);

        }
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getBack() {
        return back;
    }

    public void setBack(int back) {
        this.back = back;
    }

    // Viet ham tinh size
    public int size() {
        return back - front;
    }
}
