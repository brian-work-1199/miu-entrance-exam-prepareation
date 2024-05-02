package OnboardPractices.Arithmetic;

public class decodeArray {
    static int f(int[] a){
        int sum = 0;
        for(int i = 0; i < a.length - 1; i++){
            if(a[i] - a[i+1] > 0) {
                sum = (sum * 10) + (a[i] - a[i + 1]);
            }else{
                sum = (sum * 10) - (a[i] - a[i + 1]);
            }
        }
        return a[0] < 0 ? -sum:sum;
    }
    public static void main(String[] args) {
        System.out.println(f(new int[]{0,-3,0,-4,0}));
        System.out.println(f(new int[]{-1,5,8,17,15}));
        System.out.println(f(new int[]{1,5,8,17,15}));
        System.out.println(f(new int[]{111,115,118,127,125}));
        System.out.println(f(new int[]{1,1}));
    }
}
