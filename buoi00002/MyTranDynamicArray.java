package buoi00002;

public class MyTranDynamicArray <T> {
    private T[] arr;
private int len = 0;
private int capacity = 0;
         public MyTranDynamicArray() {
         this(16);
         }

         public MyTranDynamicArray(int capacity) {
         if (capacity < 0) {
             throw new IllegalArgumentException("Illegal Capacity: " + capacity);
             }
         this.capacity = capacity;
         arr = (T[]) new Object[capacity];
         }

         public int size() {
         return len;
         }
         public boolean isEmpty() {
             return size() == 0;
         }
         public T get(int index) {
         if (index >= len || index < 0) {
             throw new IndexOutOfBoundsException();
             }
         return arr[index];
         }

         public void set(int index, T elem) {
         if (index >= len || index < 0) {
             throw new IndexOutOfBoundsException();
             }
         arr[index] = elem;
         }

         public void clear() {
         for (int i = 0; i < len; i++) {
             arr[i] = null;

        }
         len = 0;
    }
}
