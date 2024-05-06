package OnboardPractices.Others;

public class sameNumberOfFactors {
    static int f(int n1, int n2){
        if(n1 < 0 || n2 < 0) return -1;
        int count1 = 0, count2 = 0;
        for(int i = 1; i <= n1; i++){
            if(n1%i==0) count1++;
        }
        for(int j = 1; j <= n2; j++){
            if(n2%j==0) count2++;
        }
        return count1 == count2 ? 1:0;
    }
//public static int f(int n1, int n2) {
//    if (n1 < 0 || n2 < 0) {
//        return -1; // If either argument is negative, return -1
//    }
//
//    int factors1 = countFactors(n1);
//    int factors2 = countFactors(n2);
//
//    if (factors1 == factors2) {
//        return 1; // They have the same number of factors
//    } else {
//        return 0; // They have different numbers of factors
//    }
//}
//
//    private static int countFactors(int num) {
//        int count = 0;
//        for (int i = 1; i <= Math.sqrt(num); i++) {
//            if (num % i == 0) {
//                count++;
////                if (num / i != i) {
////                    count++;
////                }
//            }
//        }
//        return count;
//    }

    public static void main(String[] args) {
        System.out.println(f(-6, 21));
        System.out.println(f(6,21 ));
        System.out.println(f(8,12 ));
        System.out.println(f(23,97 ));
        System.out.println(f(0,1 ));
        System.out.println(f(0,0 ));
    }
}
