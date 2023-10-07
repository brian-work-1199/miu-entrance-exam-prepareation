package solution;

public class isHodderNumber {

    static int f(int n){
        if(isPrime(n)){
            for(int i = 0; i < n; i++){
                if((powerofTwo(i) - 1) == n) return 1;
            }
            return 0;
        }
        return 0;
    }
    static int powerofTwo(int n){
        if(n == 0) return 1;
        return 2*powerofTwo(n-1);
    }
    static boolean isPrime(int n){
        if (n<2) return false;
        for(int i = 2; i < n; i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(f(31));
        System.out.println(f(3));
        System.out.println(f(7));
        System.out.println(f(127));
        System.out.println(f(20));
        System.out.println(f(10));
        System.out.println(f(30));
    }
}
