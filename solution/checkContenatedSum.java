package solution;

public class checkContenatedSum {
    static int f (int n, int catlen){
        int result = 0;
        int check = n;

        while (n != 0){
            int sum = 0;
            int unit = 1;
//            for (int i = 0; i < catlen; i++){
//                sum += (n%10)*unit;
//                unit *= 10;
//            }
            for (int i = 0; i < catlen; i++){
                sum = (sum*10)+(n%10);
            }
            result += sum;
            n/=10;
        }
        return check == result ? 1 : 0;
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
