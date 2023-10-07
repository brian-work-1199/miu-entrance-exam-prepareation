package solution;

public class is121Array {
    static int f(int[] a){
        int count1 = 0, count2 = 0, second1 = 0;
        if(a[0] != 1 || a[a.length-1] != 1) return 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] != 1 && a[i] != 2) return 0;
            if(a[i] == 1 && second1 == 0) count1++;
            if(a[i] == 2){
                second1 = 1;
                continue;
            }
            if(second1 == 1 && a[i] == 1) count2++;
        }
        return count1 == count2 ? 1:0;
    }

    public static void main(String[] args) {
        System.out.println(f(new int[]{1,2,1}));
        System.out.println(f(new int[]{1, 1, 2, 2, 2, 1, 1} ));
        System.out.println(f(new int[]{1, 1, 2, 2, 2, 1, 1, 1} ));
        System.out.println(f(new int[]{1, 1, 1, 2, 2, 2, 1, 1} ));
        System.out.println(f(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 3}));
        System.out.println(f(new int[]{1, 1, 1, 1, 1, 1} ));
        System.out.println(f(new int[]{2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1, 1} ));
        System.out.println(f(new int[]{1, 1, 1, 2, 2, 2, 1, 1, 1, 2, 2}));
        System.out.println(f(new int[]{2, 2, 2} ));
    }
}
