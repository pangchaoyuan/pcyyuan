import java.util.Scanner;

public class B31{
    static class FibThread extends Thread {   //继承Thread 有了
        int n;

        FibThread(int n) {
            this.n = n;
        }
        @Override
        public void run() {
            System.out.printf("fib(%d) = %d%n", this.n, fib(this.n));
        }


    }

    static long fib(int n) {
        if (n < 2) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("请输入要计算的数: ");
            int n = scanner.nextInt();
            scanner.nextLine();
            new FibThread(n).start();
        }
    }
}
