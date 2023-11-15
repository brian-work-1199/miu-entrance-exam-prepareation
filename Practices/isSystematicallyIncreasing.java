package Practices;

public class isSystematicallyIncreasing {

    static int f(int[] a){

        int i = 0;
        int num = 1;
        while(i < a.length){
            for(int j = 0; j < num; j++){
                if(a[i] != j+1) return 0;
                i++;
            }
            num++;
        }

        return 1;
    }

    public static void main(String[] args) {
        System.out.println(f(new int[]{1}));
        System.out.println(f(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4}));
        System.out.println(f(new int[]{1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5}));
        System.out.println(f(new int[]{1,2,1,2,3}));
        System.out.println(f(new int[]{1,1,3}));
        System.out.println(f(new int[]{1,2,1,2,1,2}));
        System.out.println(f(new int[]{1,2,3,1,2,1}));
        System.out.println(f(new int[]{1,1,2,3}));
    }
}
