package OnboardPractices.Arithmetic;

import java.util.Arrays;

public class computeHMS {
    static int[] f(int n){
        int[] a = new int[3];
        int second = 3600;
        for(int i = 0; i < 3; i++){
            a[i] = n/second;
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
