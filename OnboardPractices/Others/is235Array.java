package OnboardPractices.Others;

public class is235Array {
    static int f(int[] a){
        int count = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i]%2 == 0 || a[i]%3 == 0 || a[i]%5 ==0){
                if(a[i]%2 == 0) count++;
                if(a[i]%3 == 0) count++;
                if(a[i]%5 == 0) count++;
            }else{
                count++;
            }
        }
        return count == a.length ? 1:0;
    }

    public static void main(String[] args) {
        System.out.println(f(new int[]{2, 3, 5, 7, 11} ));
        System.out.println(f(new int[]{2, 3, 6, 7, 11} ));
        System.out.println(f(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}   ));
        System.out.println(f(new int[]{2, 4, 8, 16, 32} ));
        System.out.println(f(new int[]{3, 9, 27, 7, 1, 1, 1, 1, 1} ));
        System.out.println(f(new int[]{7, 11, 77, 49} ));
        System.out.println(f(new int[]{2} ));
        System.out.println(f(new int[]{} ));
        System.out.println(f(new int[]{7, 2, 7, 2, 7, 2, 7, 2, 3, 7, 7} ));
    }
}
