package KIEMTRA;

public class Main {
    public static int sum(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sum(n - 1);
    }

    public static void main(String args[]) {

        int n = 5;
        for (int i = 1; i < n; i++)
            System.out.print(i + "+");
        System.out.print(n + "=" + sum(n));
        System.out.println();
    }
}



