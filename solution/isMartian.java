package solution;

public class isMartian {

    static int f(int[] a){
        int count1 = 0, count2 = 0;
        for(int i = 0; i < a.length - 1; i++){
            if(a[i] == a[i+1]) return 0;
        }

        for(int j = 0; j < a.length; j++){
            if(a[j] == 1) count1++;
            if(a[j] == 2) count2++;
        }
        return count1 > count2 ? 1:0;
    }
    public static void main(String[] args) {
        System.out.println(f(new int[] {1,3}));
        System.out.println(f(new int[]{1, 2, 1, 2, 1, 2, 1, 2,1}));
        System.out.println(f(new int[]{1, 3, 2} ));
        System.out.println(f(new int[]{1, 3, 2, 2, 1, 5, 1, 5} ));
        System.out.println(f(new int[]{1, 2, -18, -18, 1, 2} ));
        System.out.println(f(new int[]{}));
        System.out.println(f(new int[]{1} ));
        System.out.println(f(new int[]{2}));
    }
}
