package OnboardPractices.SlideWindow;

public class isHollow {
    static int f(int[] a){
        int count = 0, countHead = 0, countTail = 0, countZero = 0;
        boolean next = false;
        if(a[0] == 0 || a[a.length - 1] == 0) return 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] != 0 && !next) countHead++;
            if(countHead != 0 && a[i] == 0){
                next = true;
                countZero++;
            }
            if(next && a[i] != 0) countTail++;
        }

        return (countHead == countTail && countZero >= 3) ? 1:0;
    }

    public static void main(String[] args) {
        System.out.println(f(new int[]{1,2,0,0,0,3,4}));
        System.out.println(f(new int[]{1,1,1,1,0,0,0,0,0,2,1,2,18}));
        System.out.println(f(new int[]{1, 2, 0, 0, 3, 4}));
        System.out.println(f(new int[]{1,2,0,0,0,3,4,5}));
        System.out.println(f(new int[]{3,8,3,0,0,0,3,3}));
        System.out.println(f(new int[]{1,2,0,0,0,3,4,0}));
        System.out.println(f(new int[]{0,1,2,0,0,0,3,4}));
        System.out.println(f(new int[]{0,0,0}));
    }
}
