package solution;

import java.util.ArrayList;
import java.util.Arrays;

public class encodeArray {

    static int[] f(int n){
        ArrayList<Integer> arr = new ArrayList<>();
        int sign = 0, digit = 0;
        if(n<0){
            n = -n;
            sign = -1;
        }else if(n == 0){
            arr.add(1);
        }
        while(n!=0){
            digit = n%10;
            if(digit >= 1) {
                arr.add(0, 1);
                for (int i = 0; i < digit; i++) {
                    arr.add(0, 0);
                }
            }else{
                arr.add(0,1);
            }
            n/=10;
        }
        if (sign == -1) arr.add(0,-1);
        int[] returnArray = new int[arr.size()];
        for (int j = 0; j < arr.size(); j++){
            returnArray[j] = arr.get(j);
        }
        return returnArray;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(f(10001)));
        System.out.println(Arrays.toString(f(0)));
        System.out.println(Arrays.toString(f(1)));
        System.out.println(Arrays.toString(f(-1)));
        System.out.println(Arrays.toString(f(10001)));
        System.out.println(Arrays.toString(f(999)));
    }
}
