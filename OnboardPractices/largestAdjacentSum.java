package OnboardPractices;

public class largestAdjacentSum {
    static int f (int[] a){
        int max = 0;
        for (int i = 1; i < a.length; i++){
            if(a[i] + a[i-1] > max){
                max = a[i] + a[i-1];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(f(new int[]{1, 2, 3, 4}));
        System.out.println(f(new int[]{18, -12, 9, -10}));
        System.out.println(f(new int[]{1,1,1,1,1,1,1,1,1}));
        System.out.println(f(new int[]{1,1,1,1,1,2,1,1,1}));
    }
}
