package buoi00002;

public class MyTranIntArray {
    private static final int DEFAULT_CAP = 1;

         public int[] arr;
 public int len = 0;
 private int capacity = 0;
    public MyTranIntArray() {
         this(DEFAULT_CAP);
         }
         public MyTranIntArray(int capacity) {
         if (capacity < 0) {
             System.out.println("Invalid");
             return;
             }
         this.capacity = capacity;
         arr = new int[capacity];
         }

    public MyTranIntArray(int[] array) {
         if (array == null) {
             System.out.println("Array cannot be null");
             return;
             }
         arr = java.util.Arrays.copyOf(array, array.length);
         capacity = array.length;
         len = array.length;
         }

         public int size() {
         return len;
         }

         public boolean isEmpty() {
         return len == 0;
         }

         public int get(int index) {
         return arr[index];
         }
         public void set(int index, int elem) {
         arr[index] = elem;
         }

         public void add(int elem) {
         if (len + 1 >= capacity) {
             if (capacity == 0) {
                 capacity = 1;
                 } else {
                 capacity *= 2;
                 }
             arr = java.util.Arrays.copyOf(arr, capacity);
             }
         arr[len++] = elem;
    }

         public void removeAt(int rm_index) {
         System.arraycopy(arr, rm_index + 1, arr, rm_index, len - rm_index - 1);
         --len;
         --capacity;
         }

         public boolean remove(int elem) {
         for (int i = 0; i < len; i++) {
             if (arr[i] == elem) {
                 removeAt(i);
                 return true;
                 }
             }
         return false;
        }

         public void reverse() {
         for (int i = 0; i < len / 2; i++) {
             int tmp = arr[i];
             arr[i] = arr[len - i - 1];
             arr[len - i - 1] = tmp;
             }
         }
         public void sort() {
         java.util.Arrays.sort(arr, 0, len);
         }
         @Override
public String toString() {
         if (len == 0) {
             return "[]";
             } else {
             StringBuilder sb = new StringBuilder(len).append("[");
             for (int i = 0; i < len - 1; i++) {
                 sb.append(arr[i] + ", ");
                 }
             return sb.append(arr[len - 1] + "]").toString();
             }
         }
}
