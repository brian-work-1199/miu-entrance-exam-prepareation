package OnboardPractices.Others;

public class isComplete {
    static int f(int[] a){
        boolean isEven = false, isSquare = false, isSumTo8 = false;
        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0 || isSquare(a[i])){
                if(a[i] % 2 == 0) isEven = true;
                if(isSquare(a[i])) isSquare = true;
            }
            for(int j = i+1; j < a.length; j++){
                if(a[i] + a[j] == 8) isSumTo8 = true;
            }
        }
        return (isEven && isSquare && isSumTo8) ? 1:0;
    }

    static boolean isSquare(int n){
        if(n < 0) return false;
        if(n == 0 || n == 1) return true;
        for(int i = 2; i <= n && i*i <= n; i++){
            if(i*i == n) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(f(new int[]{36, -28} ));
        System.out.println(f(new int[]{36, 28} ));
        System.out.println(f(new int[]{4}));
        System.out.println(f(new int[]{3, 2, 1, 1, 5, 6} ));
        System.out.println(f(new int[]{3, 7, 23, 13, 107, -99, 97, 81} ));
    }
}
