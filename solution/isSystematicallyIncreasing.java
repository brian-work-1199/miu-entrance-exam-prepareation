package solution;

public class isSystematicallyIncreasing {

    static int f(int[] a){
        if (a.length == 0) {
            return 0;
        }

        int i, temp, sequence = 0;
        for (i = 0; i < a.length;){
            if(a[i] != 1) return 0;
            i++;
            sequence++;
            temp = sequence - 1;
            while (temp > 0) {
                if (a[i - 1] != a[i] - 1) return 0;
                i++;
                temp--;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        System.out.println(f(new int[]{1,1,2,1,2,3}));
        System.out.println(f(new int[]{1}));
        System.out.println(f(new int[]{1,2,1,2,3}));
        System.out.println(f(new int[]{1,1,3}));
        System.out.println(f(new int[]{1,2,1,2,1,2}));
        System.out.println(f(new int[]{1,2,3,1,2,1}));
        System.out.println(f(new int[]{1,1,2,3}));
    }
}
