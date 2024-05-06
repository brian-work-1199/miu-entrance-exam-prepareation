package OnboardPractices.Others;

public class isTriangular {
    static int f(int n){
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
            if(sum == n) return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(f(1));
        System.out.println(f(3));
        System.out.println(f(6));
        System.out.println(f(10));
        System.out.println(f(11));
        System.out.println(f(12));
    }
}
