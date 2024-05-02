package OnboardPractices.Arithmetic;

public class isCubePower {
    static int f(int n){
        int sum = 0;
        int check = n;
        if(n <= 0) return 0;
        while(n>0){
            sum += (n%10)*(n%10)*(n%10);
            n/=10;
        }
        return sum == check ? 1:0;
    }

    public static void main(String[] args) {
        System.out.println(f(153));
        System.out.println(f(370));
        System.out.println(f(371));
        System.out.println(f(407));
        System.out.println(f(87));
        System.out.println(f(0));
        System.out.println(f(-81));
    }
}
