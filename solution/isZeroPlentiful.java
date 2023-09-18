package solution;

public class isZeroPlentiful {

    static int f(int[] a){
        int match = 0;
        int count = 0;
        int i = 0;
        if(a.length == 0) return 0;
        for(i = 0; i < a.length; i++){
            if(a[i] == 0){
                match++;
            }else if(match == 0) {
                continue;
            }else{
                if(match >= 4) {
                    count++;
                    match = 0;
                }
            }
        }
        return (a[i-1] == 0 && match >= 4) ? count+1:count;
    }
//    static int f(int[] a) {
//        if(a.length < 4) return 0;
//
//        int i, zeroCount = 0, plentyCount = 0;
//
//        for(i = 0; i < a.length; i++) {
//            if(a[i] == 0) ++zeroCount;
//            else{
//                if(zeroCount > 0 && zeroCount < 4) return 0;
//                else if(zeroCount >= 4) {
//                    ++plentyCount;
//                    zeroCount = 0;
//                }
//            }
//        }
//        if(zeroCount > 0 && zeroCount < 4) return 0;
//        plentyCount += zeroCount / 4;
//
//        return plentyCount;
//    }

    public static void main(String[] args){
        System.out.println(f(new int[]{1,2,3,4}));
        System.out.println(f(new int[]{1,0,0,0,0,0}));
        System.out.println(f(new int[]{1,2,0,0,0,0,0,2,-18,0,0,0,0,0,12}));
        System.out.println(f(new int[]{0,0,0,0,0,0,1,0,0,0,0,8,0,0,0,0,0,0}));
        System.out.println(f(new int[]{1,2,3,4}));
        System.out.println(f(new int[]{1,0,0,0,2,0,0,0,0}));
        System.out.println(f(new int[]{0}));
        System.out.println(f(new int[]{}));
    }
}
