package Practices;

public class isNPrimeable {
    static int f(int[] a, int n){
        for(int i = 0; i < a.length; i++){
            a[i] += n;
            for(int j = 2; j < a[i]; j++){
                if(a[i] % j == 0) return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(f(new int[]{5, 15, 27} , 2));
        System.out.println(f(new int[]{5, 15, 27} , 3));
        System.out.println(f(new int[]{5, 15, 26} ,2 ));
        System.out.println(f(new int[]{1, 1, 1, 1, 1, 1, 1} , 4));
        System.out.println(f(new int[]{} , 2));
    }
}
