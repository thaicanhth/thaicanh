package buoi007;

import java.util.Scanner;

public class Main {
    public static void  main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter n = ");
        int n = keyboard.nextInt();
        long result;

        result = factorialByIteration(n);
        System.out.println(n+ "! = "+ result);
        
        result = factorialByIteration(n);
        System.out.println("Result = "+ result);
    }

    private static long factorialByIteration(int n) {
        long fact=1;
        for (int i = 2; i <= n; i++) {
            fact=fact*i;
        }
        return fact;
    }
//    private static long factorialByIteration(int n) {
//        if (n==1){
//            return  1;
//        }else
//        return factorialByIteration(n);
//    }
}
