package Practices;

public class isOneBalance {
    static int f(int[] a){
//        int i = 0;
//        int total1s = 0;
//        int totalNon1s = 0;
//
//        // Skip leading 1s
//        while (i < a.length && a[i] == 1) {
//            i++;
//            total1s++;
//        }
//        // Check if remaining elements are non-1s
//        while (i < a.length && a[i] != 1) {
//            i++;
//            totalNon1s++;
//        }
//        // Check if trailing elements are 1s
//        while (i < a.length && a[i] == 1) {
//            i++;
//            total1s++;
//        }
//        // If all elements have been traversed, the array is one-balanced
//        if (i == a.length && total1s == totalNon1s) {
//            return 1;
//        } else {
//            return 0;
//        }

        int total1s = 0;
        int totalNon1s = 0;
        boolean non1Start = false;
        boolean non1End = false;
        if (a.length == 0) return 1;
        for (int number : a) {
            if (number == 1) {
                if (non1Start) non1End = true;
                total1s++;
            } else {
                if (non1End) return 0;
                non1Start = true;
                totalNon1s++;
            }
        }
        if (total1s != totalNon1s) return 0;
        return 1;
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
