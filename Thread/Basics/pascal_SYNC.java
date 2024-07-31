import java.util.*;

class pascal_SYNC{

    public synchronized static void printPascal(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");

            }
            int num = 1;
            for (int k = 1; k <= i; k++) {
                System.out.print(num + " ");
                num = num * (i - k) / k;
            }
            System.out.println();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Thread thread = new Thread(() -> {
            printPascal(n);
        });

        thread.start();

        sc.close();
    }
}
