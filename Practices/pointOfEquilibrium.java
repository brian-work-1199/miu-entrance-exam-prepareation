package Practices;

public class pointOfEquilibrium {
    static int f(int[] a){
        int i = 0, j = a.length-1;
        int index = 1;
        int first = a[i];
        int last = a[j];
        for(int k = 1; k < a.length - 2;k++){
            if(first < last){
                i++;
                first += a[i];
                index = i + 1;
            }else{
                j--;
                last += a[j];
                index = j - 1;
            }
        }
        if(first == last){
            return index;
        }else{
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(f(new int[]{1, 8, 3, 7, 10, 2}));
        System.out.println(f(new int[]{1, 5, 3, 1, 1, 1, 1, 1, 1}));
        System.out.println(f(new int[]{2, 1, 1, 1, 2, 1, 7}));
        System.out.println(f(new int[]{1, 2, 3}));
        System.out.println(f(new int[]{3, 4, 5, 10}));
        System.out.println(f(new int[]{1, 2, 10, 3, 4}));
    }
}
