package solution;

public class decodeArray {

    static int f(int[] a){
        int sign;
        int abs = 0;
        int sum = 0;
        for(int i = 1; i < a.length; i++){
            int count = a.length - i;
            if (a[i-1] < a[i]){
                abs = -(a[i-1] - a[i]);
            }else{
                abs = a[i-1] - a[i];
            }
            while(count > 1){
                abs *= 10;
                count--;
            }
            sum += abs;
        }
        return a[0] < 0 ? -sum: sum;
    }
    public static void main (String[] args){
        System.out.println(f(new int[]{0,-3,0,-4,0}));
        System.out.println(f(new int[]{-1,5,8,17,15}));
        System.out.println(f(new int[]{1,5,8,17,15}));
        System.out.println(f(new int[]{111,115,118,127,125}));

    }
}
