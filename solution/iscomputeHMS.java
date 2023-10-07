package solution;

import java.util.Arrays;

public class iscomputeHMS {
    static int[] f(int n){
        int element = 3, second = 3600;
        int[] a = new int[element];
        for (int i = 0; i < element; i++){
            a[i] = n / second;
            n = n % second;
            second /= 60;
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(f(3735)));
        System.out.println(Arrays.toString(f(380)));
        System.out.println(Arrays.toString(f(3650)));
        System.out.println(Arrays.toString(f(55)));
        System.out.println(Arrays.toString(f(0)));
    }
}
