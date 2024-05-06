package OnboardPractices.Arithmetic;

import java.util.Arrays;

public class updateMileageCounter {
    static int[] f(int[] a, int n){
        int sum = 0;
        int i = 0;
        while(i < a.length){
            sum = a[i] + n;
            a[i] = sum % 10;
            n = sum / 10;
            i++;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(f(new int[]{8, 9, 9, 5, 0}, 1)));
        System.out.println(Arrays.toString(f(new int[]{8, 9, 9, 5, 0}, 2)));
        System.out.println(Arrays.toString(f(new int[]{9,9,9,9,9,9,9,9,9,9}, 1)));
        System.out.println(Arrays.toString(f(new int[]{9,9,9,9,9,9,9,9,9,9}, 13)));
    }
}
