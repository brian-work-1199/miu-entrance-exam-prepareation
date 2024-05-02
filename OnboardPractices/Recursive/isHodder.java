package OnboardPractices.Recursive;

public class isHodder {
    static int f(int n){
        for(int i = 2; i < n; i++){
            if(n%i==0) return 0;
        }
        for(int j = 0; j < n; j++){
            if((power(2, j) - 1) == n) return 1;
        }
        return 0;
    }

    static int power(int base, int exponent){
        if(exponent == 0) return 1;
        return base*power(base, exponent - 1);
    }
    public static void main(String[] args) {
        System.out.println(f(31));
        System.out.println(f(3));
        System.out.println(f(7));
        System.out.println(f(127));
        System.out.println(f(20));
        System.out.println(f(10));
        System.out.println(f(30));
    }
}
