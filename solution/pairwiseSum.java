package solution;

import java.util.Arrays;

public class pairwiseSum {
    static int[] f(int[] a){
        if(a.length%2==1 || a.length < 1) return null;
        int[] returnArray = new int[a.length/2];
//        for(int i = 0, j = 0; i < a.length - 1; i+=2, j++){
//            returnArray[j] = a[i] + a[i+1];
//        }
        //without using j
        for(int i = 0; i < a.length - 1; i+=2){
            returnArray[i/2] = a[i] + a[i+1];
        }
        return returnArray;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(f(new int[]{2,1,18,-5})));
        System.out.println(Arrays.toString(f(new int[]{2, 1, 18, -5, -5, -15, 0, 0, 1, -1} )));
        System.out.println(Arrays.toString(f(new int[]{2, 1, 18})));
        System.out.println(Arrays.toString(f(new int[]{})));
    }
}
