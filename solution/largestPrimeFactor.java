package solution;

public class largestPrimeFactor {
    static int f(int n){
        int num = n;
        if (n <=0) return 0;
        while (num > 1){
            if (n % num == 0){
                boolean flag = true;
                for (int i = 2; i < num; i++){
                    if(num % i == 0){
                        flag = false;
                        break;
                    }
                }
                if(flag) return num;
            }
            num--;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(f(10));
        System.out.println(f(6936));
        System.out.println(f(1));
    }
}
