package Practices;

public class closestFibonacci {
    static int f(int n){
        int fibonacci = 0;
        int f1 = 1;
        int f2 = 1;
        while(fibonacci <= n){
            fibonacci = f1 + f2;
            f1 = f2;
            f2 = fibonacci;
        }
        return f1;
    }

    public static void main(String[] args) {
        System.out.println(f(8));
        System.out.println(f(13));
        System.out.println(f(33));
        System.out.println(f(34));
    }
}
