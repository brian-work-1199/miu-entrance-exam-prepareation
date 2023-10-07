package solution;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class closestFibonacci {
    static int f(int n){
        if(n<1) return 0;
        int fibo, fibo1 = 1, fibo2 = 1;
        for(int i = 3; i<n;i++){
            fibo = fibo1 + fibo2;
            if(fibo > n) break;
            fibo1 = fibo2;
            fibo2 = fibo;
        }
        return fibo2;
    }

    public static void main(String[] args){
        System.out.println(f(13));
        System.out.println(f(33));
        System.out.println(f(34));
    }
}
