package Practices;

public class isZeroBalanced {
    static int f(int[] a){
        if(a.length < 1) return 0;
        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j < a.length; j++){
                if(a[i] + a[j] == 0){
                    a[i] = ' ';
                    a[j] = ' ';
                }
            }
        }
        for(int k = 0; k < a.length; k++){
            if(a[k] != ' ') return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(f(new int[]{1, 2, -2, -1}));
        System.out.println(f(new int[]{-3, 1, 2, -2, -1, 3}));
        System.out.println(f(new int[]{3, 4, -2, -3, -2}));
        System.out.println(f(new int[]{0, 0, 0, 0, 0, 0}));
        System.out.println(f(new int[]{3, -3, -3}));
        System.out.println(f(new int[]{3}));
        System.out.println(f(new int[]{}));
    }
}
