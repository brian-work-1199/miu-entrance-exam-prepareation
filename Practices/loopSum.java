package Practices;

public class loopSum {
    static int f(int[] a, int n){
        int sum = 0;
        for(int i = 0; n > 0; i++, n--){
            sum += a[i%a.length];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(f(new int[]{1, 2, 3}, 2));
        System.out.println(f(new int[]{-1, 2, -1} , 7));
        System.out.println(f(new int[]{1, 4, 5, 6}, 4));
        System.out.println(f(new int[]{3} , 10));
    }
}
