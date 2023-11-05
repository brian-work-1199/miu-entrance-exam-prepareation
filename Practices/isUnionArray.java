package Practices;

public class isUnionArray {
    static int f(int[] a){
        int j = a.length - 1;
        for(int i = 0; i < j; i++){
            if(a[i] + a[j] > 10) return 0;
            j--;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(f(new int[]{1, 2, 19, 4, 5}));
        System.out.println(f(new int[]{1, 2, 3, 4, 15}));
        System.out.println(f(new int[]{1, 3, 9, 8}));
        System.out.println(f(new int[]{}));
        System.out.println(f(new int[]{2}));
        System.out.println(f(new int[]{-2, 5, 0, 5, 12}));
    }
}
