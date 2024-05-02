package OnboardPractices.Prime;

import java.util.ArrayList;
import java.util.Arrays;

public class encodeNumber {
    static int[] f(int n){
        ArrayList<Integer> primeFactor = new ArrayList<>();
        if(n<=1) return null;
        for(int i = 2; i <= n; i++){
            while (n%i==0){
                primeFactor.add(i);
                n /= i;
            }
        }
        int [] newArray = new int[primeFactor.size()];
        for(int j = 0; j < primeFactor.size(); j++){
            newArray[j] = primeFactor.get(j);
        }
        return newArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(f(6936)));
        System.out.println(Arrays.toString(f(2)));
        System.out.println(Arrays.toString(f(6)));
        System.out.println(Arrays.toString(f(14)));
        System.out.println(Arrays.toString(f(24)));
        System.out.println(Arrays.toString(f(1200)));
        System.out.println(Arrays.toString(f(1)));
        System.out.println(Arrays.toString(f(-18)));
    }
}
