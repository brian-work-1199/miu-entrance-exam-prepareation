package Practices;

public class isOneBalance {
    static int f(int[] a){
        int length = a.length;
        int i = 0;

        // Skip leading 1s
        while (i < length && a[i] == 1) {
            i++;
        }

        // Check if remaining elements are non-1s
        while (i < length && a[i] != 1) {
            i++;
        }

        // Check if trailing elements are 1s
        while (i < length && a[i] == 1) {
            i++;
        }

        // If all elements have been traversed, the array is one-balanced
        if (i == length) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(f(new int[]{1, 1, 1, 2, 3, -18, 45, 1} ));
        System.out.println(f(new int[]{1, 1, 1, 2, 3, -18, 45, 1, 0} ));
        System.out.println(f(new int[]{1, 1, 2, 3, 1, -18, 26, 1} ));
        System.out.println(f(new int[]{} ));
        System.out.println(f(new int[]{3, 4, 1, 1} ));
        System.out.println(f(new int[]{1, 1, 3, 4} ));
        System.out.println(f(new int[]{3, 3, 3, 3, 3, 3} ));
        System.out.println(f(new int[]{1, 1, 1, 1, 1, 1}));
    }
}
