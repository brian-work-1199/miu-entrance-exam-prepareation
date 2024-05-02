package OnboardPractices.Arithmetic;

public class checkContenatedSum {
    static int f(int n, int catlen){
        int sum = 0;
        int check = n;
        while(n > 0){
            int cat = 0;
            for(int i =0; i < catlen; i++){
                cat = (cat*10) + n%10;
            }
            sum+=cat;
            n/=10;
        }
        return sum == check ? 1:0;
    }
    public static void main(String[] args) {
        System.out.println(f(198,2));
        System.out.println(f(198,3));
        System.out.println(f(2997,3));
        System.out.println(f(2997,2));
        System.out.println(f(13332,4));
        System.out.println(f(9,1));
    }
}
