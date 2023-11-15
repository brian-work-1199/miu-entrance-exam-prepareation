package Practices;

import java.util.Arrays;

public class computeHMS {
    static int[] f(int n){
        int[] a = new int[3];
        int i = 0;
        int unit = 3600;
        while(unit != 0){
            a[i] = n/unit;
            n = n % unit;
            unit /= 60;
            i++;
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
