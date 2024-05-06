package OnboardPractices.Others;

public class isVesuvian {

    static int f(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if((i*i + j*j) == n) count++;
            }
        }
        return count >= 2 ? 1:0;
    }

    public static void main(String[] args) {
        System.out.println(f(50));
        System.out.println(f(65));
        System.out.println(f(85));
        System.out.println(f(60));
        System.out.println(f(30));
    }
}
