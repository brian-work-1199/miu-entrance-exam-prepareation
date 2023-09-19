package solution;

public class decodeArrayy {

    static int f(int[] a){
        int i, match = 0;
        int sum = 0;
        for(i=0;i<a.length;i++){
            if(a[i] == 0){
                match++;
            }else{
                sum = sum*10 + match;
                match = 0;
            }
        }
        return a[0] < 0 ? -sum:sum;
    }
    public static void main(String[] args){
        System.out.println(f(new int[]{0,0,0,1,0,0,0,0,1}));
        System.out.println(f(new int[]{1}));
        System.out.println(f(new int[]{0,1}));
        System.out.println(f(new int[]{-1,0,1}));
        System.out.println(f(new int[]{0,1,1,1,1,1,0,1}));
        System.out.println(f(new int[]{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,1}));
    }
}
