package Practices;

import java.util.Arrays;

public class pairwiseSum {
    static int[] f(int[] a){
        int[] result = new int[a.length/2];
        if((a.length % 2 == 1) || (a.length == 0)) return null;
        for(int i = 0; i < a.length - 1; i+=2){
            result[i/2] = a[i] + a[i+1];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(f(new int[]{2,1,18,-5})));
        System.out.println(Arrays.toString(f(new int[]{2, 1, 18, -5, -5, -15, 0, 0, 1, -1} )));
        System.out.println(Arrays.toString(f(new int[]{2, 1, 18})));
        System.out.println(Arrays.toString(f(new int[]{})));
    }
}
