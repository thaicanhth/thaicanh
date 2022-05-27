package buoi07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 5, 6, 8, 9, 12};

        int result = calculateSum(arr);
        System.out.println("Sum = " + result);

        result = recursion(arr, arr.length - 1);
        System.out.println("Sum = " + result);
    }

    private static int calculateSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    private static int recursion(int[] arr, int i) {
        if (i < 0) {
            return 0;
        } else {
            return arr[i] + recursion(arr, --i);
        }
    }
}
