package Practices;

public class centralArray {
    static int f(int[] a){
        if(a == null || a.length % 2 == 0) return 0;
        int midIndex = a.length/2;
        int midValue = a[midIndex];
        for(int i = 0; i < a.length; i++){
            if(midIndex != i && a[i] <= midValue) return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(f(new int[]{1, 2, 3, 4, 5}));
        System.out.println(f(new int[]{3, 2, 1, 4, 5}));
        System.out.println(f(new int[]{3, 2, 1, 4, 1}));
        System.out.println(f(new int[]{1, 2, 3, 4}));
        System.out.println(f(new int[]{}));
        System.out.println(f(new int[]{10}));
    }
}
