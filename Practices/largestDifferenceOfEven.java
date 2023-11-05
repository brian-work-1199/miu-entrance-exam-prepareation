package Practices;

public class largestDifferenceOfEven {
    static int f(int[] a){
        int firstEven = 0;
        int differenceEven = 0;
        int max = -1;

        if(a.length < 2) return -1;
        for(int i = 0; i < a.length; i++){
            if(a[i] % 2 == 0){
                firstEven = a[i];
                for(int j = i+1; j < a.length; j++){
                    if(a[j] % 2 == 0){
                        differenceEven = a[j] - firstEven > 0 ? a[j] - firstEven : firstEven - a[j];
                        max = differenceEven > max ? differenceEven : max;
                    }
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(f(new int[]{2}));
        System.out.println(f(new int[]{1,3,5,9}));
        System.out.println(f(new int[]{1,18,5,7,33}));
        System.out.println(f(new int[]{2,2,2,2}));
        System.out.println(f(new int[]{1,2,1,2,1,4,1,6,4}));
    }
}
