import java.util.Scanner;

class FirstNon_Repeating_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of elements : ");
        int n = sc.nextInt();
        System.out.println("The array elements are : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = findFirstNonRepeatingElement(arr, n);
        System.out.println("The  first non repeated element is : ");
        System.out.println(result);
    }

    private static int findFirstNonRepeatingElement(int[] arr, int n) {
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            count[i] = 1;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (count[i] == 1) {
                return arr[i];
            }
        }
        return -1;
    }
}
