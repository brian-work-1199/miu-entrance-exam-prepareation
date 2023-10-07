package solution;

public class isFibonacci {
    static int f(int n){
        int fibo1 = 1;
        int fibo2 = 1;
        int fibo = 0;
        for(int i = 2; i <= n; i++){
            fibo = fibo1 + fibo2;
            if(fibo == n) return 1;
            fibo1 = fibo2;
            fibo2 = fibo;
        }
        return 0;

    }
    public static void main(String[] args){
        System.out.println(f(13));
        System.out.println(f(27));
        System.out.println(f(21));
        System.out.println(f(34));
        System.out.println(f(4));
        System.out.println(f(7));
    }
}
