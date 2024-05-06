package OnboardPractices.SampleTest;

public class reverseInteger {
    static int f(int n){
        int sum = 0;
        int sign = 1;
        if(n < 0){
            n = - n;
            sign = -1;
        }
        while(n!=0){
            sum = sum*10 + n%10;
            n/=10;
        }
        return sign*sum;
    }

    public static void main(String[] args) {
        System.out.println(f(1234));
        System.out.println(f(12005));
        System.out.println(f(1));
        System.out.println(f(1000));
        System.out.println(f(0));
        System.out.println(f(-12345));
    }
}
