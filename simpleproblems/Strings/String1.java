import java.util.ArrayList;
import java.util.Scanner;

public class String1 {

    static ArrayList<String> insertFirst(ArrayList<String> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter element to add");
        String str = sc.next();

        list.add(0, str);

        sc.close();

        return list;
    }

    static ArrayList<String> reverse(ArrayList<String> list) {
        ArrayList<String> reversed = new ArrayList<>();

        for (int i = (list.size()) - 1; i >= 0; i--) {
            reversed.add(list.get(i));
        }
        return reversed;
    }

    static String compare(ArrayList<String> list, ArrayList<String> new_list) {
        int res = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; i < (new_list.size()) - 1; j++) {
                if (list.get(i) == new_list.get(j)) {
                    res += 1;
                } else {
                    break;
                }
            }
        }
        // System.out.println(res);
        if (res < list.size()) {
            return "Not Equal";
        } else {
            return "Equal";
        }
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> new_list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        String str;
        int val = 0;

        while (true) {
            val = sc.nextInt();
            if (val != -1) {
                str = sc.next();
                list.add(str);
            } else {
                break;
            }
        }
        while (true) {
            val = sc.nextInt();
            if (val != -1) {
                str = sc.next();
                new_list.add(str);
            } else {
                break;
            }
        }

        System.out.println("First Question\n" + list);

        System.out.println("second Question\n" + reverse(list));

        System.out.println("Third Question\n" + compare(list, new_list));

        System.out.println("\nFourth Question");
        System.out.println(insertFirst(list));

        sc.close();
    }
}