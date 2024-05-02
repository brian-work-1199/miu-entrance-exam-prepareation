package OnboardPractices.Arithmetic;

public class isDigitIncreasing {

    static int f(int n){
        int check = n;
        for(int i = 1; i <= 9; i++) {
            int sum = 0;
            int result = 0;
            while (n > 0) {
                sum = sum*10 + i;
                result += sum;
                n /= 10;
            }
            n=check ;
            if(result == check) return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(f(7));
        System.out.println(f(36));
        System.out.println(f(984));
        System.out.println(f(7404));
    }
}
