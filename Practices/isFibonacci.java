package Practices;

public class isFibonacci {
    static int f(int n){
        int fibo1 = 1;
        int fibo2 = 1;
        int fibonacci = 0;
        while(fibonacci < n){
            fibonacci = fibo1 + fibo2;
            if(fibonacci == n) return 1;
            fibo1 = fibo2;
            fibo2 = fibonacci;
        }
        return 0;
//        int a = 1;
//        int b = 1;
//
//        while (b < n) {
//            int temp = a;
//            a = b;
//            b = temp + b;
//        }
//        return b == n ? 1:0;
    }

    public static void main(String[] args) {
        System.out.println(f(13));
        System.out.println(f(27));
        System.out.println(f(21));
        System.out.println(f(34));
        System.out.println(f(4));
        System.out.println(f(7));
    }
}
