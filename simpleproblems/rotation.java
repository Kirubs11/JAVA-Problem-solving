import java.util.*;

public class rotation {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
       
        int d = scanner.nextInt();       
        int[] array = new int[n];       
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }   
        array = leftRotate(array, d);
        
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
    
    public static int[] leftRotate(int[] array, int d) {
        int n = array.length;
        int[] result = new int[n];        
        for (int i = 0; i < n; i++) {
            result[i] = array[(i + d) % n];
        }
        
        return result;
    }
}
