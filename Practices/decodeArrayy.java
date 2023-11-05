package Practices;

public class decodeArrayy {

    static int f(int[] a){
        int sum = 0;
        int count = 0;

        for(int i = 0; i < a.length; i++){
            if(a[i] == 0){
                count++;
            }else if (count == 0){
                sum = sum*10;
                continue;
            } else if(count != 0 && a[i] == 1){
                sum = sum*10 + count;
                count = 0;
            }
        }
        return a[0] < 0 ? -sum:sum;
    }

    public static void main(String[] args) {
        System.out.println(f(new int[]{0,0,0,1,0,0,0,0,1}));
        System.out.println(f(new int[]{1}));
        System.out.println(f(new int[]{0,1}));
        System.out.println(f(new int[]{-1,0,1}));
        System.out.println(f(new int[]{0,1,1,1,1,1,0,1}));
        System.out.println(f(new int[]{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1}));
    }
}
