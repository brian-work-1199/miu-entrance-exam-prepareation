package solution;

import java.util.Arrays;

public class largestDifferenceOfEvens {
    static int f1(int[] a){
        int i,j,firstEvenNum = 0,max = 0, count = 0;
        for(i = 0; i < a.length; i++){
            if(a[i]%2==0){
                firstEvenNum = a[i];
                    for (j = i+1; j < a.length; j++) {
                        if (a[j] % 2 == 0 && a[j] >= firstEvenNum && a[j] - firstEvenNum >= max) {
                            max = a[j] - firstEvenNum;
                            count++;
                        }else if(a[j] % 2 == 0 && a[j] <= firstEvenNum && firstEvenNum - a[j] >= max){
                            max = firstEvenNum - a[j];
                            count++;
                        }
                    }
                    return count != 0 ? max:-1;
            }
        }
        return -1;
    }

    static int f(int[] a) {
        int firstEvenNum = 0, max = -1;

        if (a.length < 2) return -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                firstEvenNum = a[i];
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] % 2 == 0) {
                        int differenceEven = (a[j] - firstEvenNum > firstEvenNum - a[j]) ? a[j] - firstEvenNum : firstEvenNum - a[j];
                        max = (differenceEven > max) ? differenceEven : max;
                    }
                }
            }
        }
        return max;
    }
    public static void main(String[] args){
        System.out.println(f(new int[]{1,3,5,9}));
        System.out.println(f(new int[]{1,18,5,7,33}));
        System.out.println(f(new int[]{2,2,2,2}));
        System.out.println(f(new int[]{1,2,1,2,1,4,1,6,4}));
    }
}
