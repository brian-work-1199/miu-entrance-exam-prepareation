package Practices;

import java.util.Arrays;

public class commonElement {
    static int[] f(int[] first, int[] second){
        if(first == null || second == null) return null;
        if(first.length == 0 || second.length == 0) return new int[]{};
        int min = first.length > second.length ? second.length : first.length;
        int[] temp = new int[min];
        int k = 0;
        for(int i = 0; i < first.length; i++){
            for(int j = 0; j < second.length; j++){
                if(first[i] == second[j]){
                    temp[k] = first[i];
                    k++;
                }
            }
        }
        int[] result = new int[k];
        for(int t = 0; t < result.length; t++){
            result[t] = temp[t];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(f(new int[]{1, 8, 3, 2}, new int[]{4, 2, 6, 1})));
        System.out.println(Arrays.toString(f(new int[]{1, 8, 3, 2, 6}, new int[]{2, 6, 1})));
        System.out.println(Arrays.toString(f(new int[]{1, 3, 7, 9}, new int[]{7, 1, 9, 3})));
        System.out.println(Arrays.toString(f(new int[]{1, 2}, new int[]{3, 4})));
        System.out.println(Arrays.toString(f(new int[]{}, new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(f(new int[]{1, 2}, new int[]{})));
        System.out.println(Arrays.toString(f(new int[]{1, 2}, null)));
        System.out.println(Arrays.toString(f(null, new int[]{})));
        System.out.println(Arrays.toString(f(null, null)));
    }
}
