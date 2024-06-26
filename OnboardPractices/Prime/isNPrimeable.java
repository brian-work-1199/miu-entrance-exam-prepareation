package OnboardPractices.Prime;

public class isNPrimeable {

    static int f(int[] a, int n){
        for(int i = 0; i < a.length; i++){
            if(!(isPrime(a[i] + n))) return 0; //*****
        }
        return 1;
    }
    static boolean isPrime(int n){
        if(n <= 1) return false;
        for(int i = 2; i < n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(f(new int[]{5, 15, 27} , 2));
        System.out.println(f(new int[]{5, 15, 27} , 3));
        System.out.println(f(new int[]{5, 15, 26} ,2 ));
        System.out.println(f(new int[]{1, 1, 1, 1, 1, 1, 1} , 4));
        System.out.println(f(new int[]{} , 2));
    }
}
