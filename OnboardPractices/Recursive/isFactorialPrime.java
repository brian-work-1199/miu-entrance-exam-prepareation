package OnboardPractices.Recursive;

public class isFactorialPrime {

    static int f(int n){
        for(int i = 2; i < n; i++){
            if(n%i==0) return 0;
        }
        for(int j = 0; j <= n; j++){
            if((factorial(j) + 1) == n) return 1;
        }
        return 0;
    }

    static int factorial(int n){
        if(n==0) return 1;
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        System.out.println(f(3 ));
        System.out.println(f(2));
        System.out.println(f(7));
        System.out.println(f(8));
        System.out.println(f(11));
        System.out.println(f(721));
    }
}
