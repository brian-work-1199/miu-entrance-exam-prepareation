package Practices;

import java.util.ArrayList;
import java.util.Arrays;

public class encodeArray {
    static int[] f(int n){
        ArrayList<Integer> array = new ArrayList<>();
        int sign = 0;
        if(n<0){
            n = -n;
            sign = -1;
        }else if(n == 0){
            array.add(1);
        }
        while(n!=0) {
            array.add(0, 1);
            for (int i = 0; i < n % 10; i++) {
                array.add(0, 0);
            }
            n /= 10;
        }
        if(sign == -1) array.add(0, -1);
        int [] resultArray = new int[array.size()];
        for(int j = 0; j < array.size(); j++){
            resultArray[j] = array.get(j);
        }
        return resultArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(f(0)));
        System.out.println(Arrays.toString(f(1)));
        System.out.println(Arrays.toString(f(-1)));
        System.out.println(Arrays.toString(f(10001)));
        System.out.println(Arrays.toString(f(999)));
        System.out.println(Arrays.toString(f(9199)));
    }
}
