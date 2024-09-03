import java.util.*;

class PrimeNumber {
    public static void main(String args[]) {
        Scanner ob = new Scanner(System.in);
        long n = ob.nextLong();
        int count = 0;
        for (int i = 2; i <=n/2; i++) {
            if (n % i == 0) count = 1;
        }
        if (count > 0 || n == 1 || n == 0) {
            System.out.print("not prime");
        } else {
            System.out.print("prime");
        }
    }
}
