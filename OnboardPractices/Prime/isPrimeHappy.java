package OnboardPractices.Prime;

public class isPrimeHappy {
    static int f(int n){
        int sum = 0;
        for(int i = 2; i < n; i++){
            boolean isPrime = true;
            for(int j = 2; j < i; j++){
                if(i%j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                sum += i;
            }
        }
        return (sum%n==0 && n > 2) ? 1:0;
    }
    public static void main(String[] args) {
        System.out.println(f(5));
        System.out.println(f(25));
        System.out.println(f(32));
        System.out.println(f(8));
        System.out.println(f(2));
    }
}
