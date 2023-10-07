package solution;

public class isSquare {
    static int f(int n){
        for(int i = 0; i <= n && i*i <= n ; i++){
            if(i*i == n) return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println(f(20));
        System.out.println(f(25));
        System.out.println(f(-4));
        System.out.println(f(8));
        System.out.println(f(0));
    }
}
