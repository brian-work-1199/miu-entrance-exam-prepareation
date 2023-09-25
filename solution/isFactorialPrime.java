package solution;

public class isFactorialPrime {

    static int f(int n){
        if(isPrime(n)){
            for(int i = 0; i < n; i++){
                if(factorialNumber(i)+1==n) return 1;
            }
        }
        return 0;
    }

    static int factorialNumber(int n){
        if(n==0||n==1) return 1;
        return n*factorialNumber(n-1);
    }
    static boolean isPrime(int n){
        if(n<=1) return false;
        for(int i = 2; i < n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(f(3));
        System.out.println(f(2));
        System.out.println(f(7));
        System.out.println(f(8));
        System.out.println(f(11));
        System.out.println(f(721));
    }
}
