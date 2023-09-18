package solution;

import java.util.ArrayList;
import java.util.Arrays;

public class encodeNumber {

    static int[] f(int n){
        ArrayList<Integer> primeFactors = new ArrayList<>();
        int k = 0;
        if (n <= 1) return null;
        for(int i = 2; i < n; i++){
            while(n%i==0){
                primeFactors.add(i);
                n /= i;
            }
        }
        if (n > 1) primeFactors.add(n);
        int [] returnArray = new int[primeFactors.size()];
        for (int j = 0; j < primeFactors.size(); j++){
            returnArray[j] = primeFactors.get(j);
        }
        return returnArray;
    }
    public static void main (String[] args){
        System.out.println(Arrays.toString(f(2)));
        System.out.println(Arrays.toString(f(6)));
        System.out.println(Arrays.toString(f(14)));
        System.out.println(Arrays.toString(f(24)));
        System.out.println(Arrays.toString(f(1200)));
        System.out.println(Arrays.toString(f(1)));
        System.out.println(Arrays.toString(f(-18)));
    }
}
