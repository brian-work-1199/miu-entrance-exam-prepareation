package Practices;

public class closestFibonacci {
    static int f(int n){
       int fibo1 = 1;
       int fibo2= 1;
       int fibonacci = 0;
       if(n < 1) return 0;
       while(fibonacci <= n){
           fibonacci = fibo1 + fibo2;
           fibo1 = fibo2;
           fibo2 = fibonacci;
       }
        return fibo1;
    }

    public static void main(String[] args) {
        System.out.println(f(8));
        System.out.println(f(13));
        System.out.println(f(33));
        System.out.println(f(34));
    }
}
