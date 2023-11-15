package Practices;

public class isSquare {

    static int f(int n){
        if(n < 0) return 0;
        if(n == 0 || n == 1) return 1;
        for(int i = 2; i <= n && i*i <= n; i++){
            if(i*i == n) return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(f(4));
        System.out.println(f(25));
        System.out.println(f(-4));
        System.out.println(f(8));
        System.out.println(f(0));
    }
}
