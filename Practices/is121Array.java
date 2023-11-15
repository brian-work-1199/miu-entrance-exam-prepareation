package Practices;

public class is121Array {

    static int f(int[] a){
        int countHead = 0, countTail = 0;
        boolean next = false;
        if(a[a.length-1] != 1 || a[0] != 1) return 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == 1 && !next) countHead++;
            if((countHead != 0) && (a[i] == 2)) next = true;
            if(next && a[i] == 1) countTail++;
        }
        return countHead == countTail ? 1:0;
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
