package buoi7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter n = ");
        int n = keyboard.nextInt();
        long result;
        System.out.println("================");
        result = factorialByIteration(n);
        System.out.println(n + "! = " + result);


        result = factorialByIteration(n);
        System.out.println(n + "! = " + result);
    }

    // n!= 1*2*3*4*5
    private static long factorialByIteration(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * 1;
        }
        return fact;
    }

    private static long factorialByRecursion(int n) {
        //chưa 1 loi goi chinh
        if (n == 1) {
            return 1;
        } else {
            return n * factorialByIteration(n - 1);
        }
    }
}
