package Practices;

public class sumOddEven {
    static int f(int[] a){
        int X = 0, Y = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                Y += a[i];
            }else{
                X += a[i];
            }
        }
        return X - Y;
    }

    public static void main(String[] args) {
        System.out.println(f(new int[]{1}));
        System.out.println(f(new int[]{1,2}));
        System.out.println(f(new int[]{1,2,3}));
        System.out.println(f(new int[]{1,2,3,4}));
        System.out.println(f(new int[]{3, 3, 4, 4}));
        System.out.println(f(new int[]{3, 2, 3, 4}));
        System.out.println(f(new int[]{4, 1, 2, 3}));
        System.out.println(f(new int[]{1, 1}));
        System.out.println(f(new int[]{}));
    }
}
