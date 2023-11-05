package Practices;

public class isPrimeHappy {

    static int f(int n){
        int sum = 0;
        for(int j = 2; j < n; j++){
            boolean isPrime = true;
            for(int i = 2; i < j; i++){
                if(j%i==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                sum+=j;
            }
        }

        return (sum%n == 0 && n > 2) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(f(5));
        System.out.println(f(25));
        System.out.println(f(32));
        System.out.println(f(8));
        System.out.println(f(2));
    }
}
