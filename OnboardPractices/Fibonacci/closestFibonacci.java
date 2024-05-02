package OnboardPractices.Fibonacci;

public class closestFibonacci {
    static int f(int n){
       int fibo1 = 1;
       int fibo2 = 1;
       int fibo = 0;
       if(n<1) return 0;
       while(fibo < n){ // fibo less than n return fibo2; fibo less than or equal return fibo1
           fibo = fibo1 + fibo2;
           fibo1 = fibo2;
           fibo2 = fibo;
       }
       return fibo2;
    }

    public static void main(String[] args) {
        System.out.println(f(8));
        System.out.println(f(13));
        System.out.println(f(33));
        System.out.println(f(34));
    }
}
