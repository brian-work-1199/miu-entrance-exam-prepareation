package Practices;

public class isSequencedArray {
    static int f(int[] a, int m, int n){
        if(a.length < 1 || a[0] != m || a[a.length-1] != n || m > n){
            return 0;
        }
        for(int i = 1; i < a.length; i++){
            if(a[i] == a[i-1] || a[i] == a[i-1] + 1){
                continue;
            }
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(f(new int[]{1, 2, 3, 4, 5},1,5));
        System.out.println(f(new int[]{1, 3, 4, 2, 5} ,1,5));
        System.out.println(f(new int[]{-5, -5, -4, -4, -4, -3, -3, -2, -2, -2},-5,-2));
        System.out.println(f(new int[]{0, 1, 2, 3, 4, 5} ,1,5));
        System.out.println(f(new int[]{1, 2, 3, 4},1,5));
        System.out.println(f(new int[]{1, 2, 5} ,1,5));
        System.out.println(f(new int[]{5, 4, 3, 2, 1} ,1,5));
    }
}
