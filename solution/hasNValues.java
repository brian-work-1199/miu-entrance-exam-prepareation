package solution;

public class hasNValues {
    static int f(int[] a, int n){
//        int[] newArray = new int[n];
        int count = 0;
        for(int i = 0; i < a.length - 1; i++){
            for(int j = i+1; j < a.length ; j++){
                if(a[i] != a[j]){
                    count++;
                }
            }
        }
        return count == n ? 1:0;
    }
    public static void main(String[] args) {
        System.out.println(f(new int[]{1, 2, 2, 1} , 2));
        System.out.println(f(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 3));
        System.out.println(f(new int[]{1, 2, 3, 4, 5, 6, 7, 8 ,9,10} , 10));
        System.out.println(f(new int[]{1, 2, 2, 1} , 3));
        System.out.println(f(new int[]{1, 1, 1, 8, 1, 1, 1, 3, 3}, 2));
        System.out.println(f(new int[]{1, 2, 3, 4, 5, 6, 7, 8 ,9,10} , 20));
    }
}
