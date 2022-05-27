package Buoi6;

import java.util.NoSuchElementException;

public class MyArrayCircularQueue {
    private Employee[] queue;
    private int front;
    private int back;

    public MyArrayCircularQueue(int capacity) {
        queue = new Employee[capacity];
    }
    public void addToBack(Employee employee) {
        // Neu full khong them duoc thi nho quy tac phinh bung khi uong beer
        if (size() == queue.length - 1) {
            int numItems = size();
            Employee[] newArray = new Employee[2 * queue.length];
            // Copy cac phan tu vao mang moi
            System.arraycopy(queue, front, newArray, 0, queue.length - front);
            System.arraycopy(queue, 0, newArray, queue.length - front, back);
            queue = newArray;
            front = 0;
            back = numItems;
        }
        // them vao binh thuong
        queue[back] = employee;
        // Chia ra 2 truong hop
        // back nho hon length: them duoc tang back
        // back lon hon length: vong khac roi, lui back ve ban dau
        if (back < queue.length - 1) {
            back++;
        } else {
            back = 0;
        }
    }
    // Viet ham xoa phan tu tu front
    public Employee removeFromFront() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        Employee employee = queue[front];
        queue[front] = null;
        front++;
        // Giong cai cu~
        if (size() == 0) {
            front = 0;
            back = 0;
        } else if (front == queue.length) {
            front = 0;
        }
        return employee;
    }
    public Employee peek() {
        if (size() == 0) {
            throw new NoSuchElementException();
        }
        return queue[front];
    }
    public int size() {
        if (front <= back) {
            return back - front;
        } else {
            // Khac o cho front co the lon hon back
            // Do back quay ve 0 trong nhung lan add vong tron
            return back - front + queue.length; // Kieu la lap qua vong thu n
        }
    }
    public void printMyQueue(){
        if (front <= back) {
            for (int i = front; i < back; i++) {
                System.out.println(queue[i]);
            }
        } else {
            for (int i = front; i < queue.length; i++) {
                System.out.println(queue[i]);
            }
            for (int i = 0; i < back; i++) {
                System.out.println(queue[i]);
            }
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
}

