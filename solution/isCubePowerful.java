package solution;

public class isCubePowerful {

    static int f(int n){
        int modulo = 0;
        int check = n;
        int sum = 0;
        if (n <= 0) return 0;
//        while(n!=0){
//            int powOfThree = 1;
//            modulo = n%10;
//            for(int i = 0; i < 3; i++){
//                powOfThree *= modulo;
//            }
//            sum += powOfThree;
//            n /= 10;
//        }
        while(n!=0){
            modulo = n%10;
            sum += (modulo*modulo*modulo);
            n /= 10;
        }
        return check == sum ? 1: 0;
    }
    public static void main (String[] args){
        System.out.println(f(153));
        System.out.println(f(370));
        System.out.println(f(371));
        System.out.println(f(407));
        System.out.println(f(87));
        System.out.println(f(0));
        System.out.println(f(-81));
    }
}
