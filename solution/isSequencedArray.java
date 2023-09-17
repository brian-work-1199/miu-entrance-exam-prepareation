package solution;

public class isSequencedArray {
    static int f(int[] a, int m, int n) {
        if (a.length <= 1 || a[0] != m || a[a.length - 1] != n || m > n)
            return 0;

        for (int i = m; i <= n; i++) {
            boolean flag = false;

            for (int j = 1; j <= a.length - 1; j++) {
                if (a[j - 1] > a[j]) {
                    return 0;
                }

                if (a[j - 1] == i || a[j] == i) {
                    flag = true;
                    break;
                }
            }
            if (!flag)
                return 0;
        }

        return 1;
    }

    public static int f2(int[] a, int m, int n) {
        if (a.length < 1 || a[0] != m || a[a.length - 1] != n) {
            return 0;
        }
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1] || (a[i] == a[i - 1] + 1)) {
                continue;
            }
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(f(new int[]{-5, -5, -4, -4, -4, -3, -3, -2, -2, -2}, -5, -2));
        System.out.println(f2(new int[]{-5, -5, -4, -4, -4, -3, -3, -2, -2, -2}, -5, -2));
    }
}
