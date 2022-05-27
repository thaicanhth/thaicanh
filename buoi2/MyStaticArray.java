package buoi2;

import java.util.Scanner;

public class MyStaticArray {
    private int[] myStaticArray;
    Scanner input = new Scanner(System.in);

    public MyStaticArray() {
    }

    public MyStaticArray(int[] myStaticArray) {
        this.myStaticArray = myStaticArray;
    }

    public int[] getMyStaticArray() {
        return myStaticArray;
    }

    public void setMyStaticArray(int[] myStaticArray) {
        this.myStaticArray = myStaticArray;
    }

    // Ham tao ra mang
    public void enterArray() {
        for (int i = 0; i < myStaticArray.length; i++) {
            System.out.print("myStaticArray[" + i + "]= ");
            myStaticArray[i] = input.nextInt();
        }
    }

    // Ham in mang
    public void displayArray() {
        System.out.println("==============");
        for (int i = 0; i < myStaticArray.length; i++) {
            System.out.print(" " + myStaticArray[i]);
        }
        System.out.println("");
    }

    // Ham in mang Dao
    public void displayArrayReverse() {
        System.out.println("==============");
        for (int i = myStaticArray.length - 1; i >= 0; i--) {
            System.out.print(" " + myStaticArray[i]);
        }
        System.out.println("");
    }

    // Ham in mang For Each
    public void displayArrayForEach() {
        System.out.println("==============");
        // fore
        for (int number : myStaticArray) {
            System.out.print(" " + number);
        }
        System.out.println("");
    }

    // Ham Tim kiem value trong mang
    public int findValueInArray(int value) {
        for (int i = 0; i < myStaticArray.length; i++) {
            if (myStaticArray[i] == value) {
                return i;
            }
        }
        return -1;// vi khong co index = -1, nen khi return -1: khong tim thay
    }

    @Override
    public String toString() {
        return "MyStaticArray{" + "myStaticArray=" + myStaticArray + '}';
    }
}
