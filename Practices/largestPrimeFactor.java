package Practices;

public class largestPrimeFactor {
    static int f(int n){
        if(n <= 1) return 0;
        for(int i = n - 1; i > 1; i--){
            if(n % i == 0){
                boolean flag = true;
                for(int j = 2; j < i; j++){
                    if(i%j==0){
                        flag = false;
                        break;
                    }
                }
                if(flag) return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(f(10));
        System.out.println(f(6936));
        System.out.println(f(1));
    }
}
