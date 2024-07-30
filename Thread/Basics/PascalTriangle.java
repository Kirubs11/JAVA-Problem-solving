public class PascalTriangle {
    public static void main(String[] args) {
        int rows = 5; 

        TrianglePrinter printer = new TrianglePrinter(rows);
        Thread t1 = new Thread(printer);
        Thread t2 = new Thread(printer);
        t1.start();
        t2.start();
    }
}

class TrianglePrinter implements Runnable {
    private final int rows;
    private final Object lock = new Object();

    public TrianglePrinter(int rows) {
        this.rows = rows;
    }

    @Override
    public void run() {
        synchronized (lock) {
            try {
                Thread.sleep(2000);
                for (int i = 0; i < rows; i++) {
                    int number = 1;
                    System.out.printf("%" + (rows - i) * 2 + "s", "");
                    for (int j = 0; j <= i; j++) {
                        System.out.printf("%4d", number);
                        number = number * (i - j) / (j + 1);
                    }
                    System.out.println();
                }
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}
