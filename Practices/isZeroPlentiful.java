package Practices;

public class isZeroPlentiful {

    static int f(int[] a){
        int count = 0;
        int countSequence = 0;
        if(a.length == 0) return 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == 0){
                count++;
            } else if (count == 0) {
                continue;
            } else {
                if(count >= 4){
                    countSequence++;
                    count = 0;
                }
            }
        }
        return (a[a.length - 1] == 0 && count >= 4) ? countSequence+1 : countSequence;
    }

    public static void main(String[] args) {
        System.out.println(f(new int[]{1,0,0,0,0,0}));
        System.out.println(f(new int[]{1,2,0,0,0,0,0,2,-18,0,0,0,0,0,12}));
        System.out.println(f(new int[]{0,0,0,0,0,0,1,0,0,0,0,8,0,0,0,0,0,0}));
        System.out.println(f(new int[]{1,2,3,4}));
        System.out.println(f(new int[]{1,0,0,0,2,0,0,0,0}));
        System.out.println(f(new int[]{0}));
        System.out.println(f(new int[]{}));
    }
}
