package OnboardPractices.SampleTest;

import java.util.Arrays;

public class zeroBaseChar {

    static char[] f(char[] a, int start, int len){
        if(start < 0 || len < 0 || (start+len > a.length)) return null;
        char[] result = new char[len];
        for(int i = start, j = 0; j < len; i++, j++){
            result[j] = a[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(f(new char[]{'a', 'b', 'c'}, 0,4)));
        System.out.println(Arrays.toString(f(new char[]{'a', 'b', 'c'}, 0,3)));
        System.out.println(Arrays.toString(f(new char[]{'a', 'b', 'c'}, 0,2)));
        System.out.println(Arrays.toString(f(new char[]{'a', 'b', 'c'}, 0,1)));
        System.out.println(Arrays.toString(f(new char[]{'a', 'b', 'c'}, 1,3)));
        System.out.println(Arrays.toString(f(new char[]{'a', 'b', 'c'}, 1,2)));
        System.out.println(Arrays.toString(f(new char[]{'a', 'b', 'c'}, 1,1)));
        System.out.println(Arrays.toString(f(new char[]{'a', 'b', 'c'}, 2,2)));
        System.out.println(Arrays.toString(f(new char[]{'a', 'b', 'c'}, 2,1)));
        System.out.println(Arrays.toString(f(new char[]{'a', 'b', 'c'}, 3,1)));
        System.out.println(Arrays.toString(f(new char[]{'a', 'b', 'c'},1 ,0)));
        System.out.println(Arrays.toString(f(new char[]{'a', 'b', 'c'}, -1,2)));
        System.out.println(Arrays.toString(f(new char[]{'a', 'b', 'c'}, -1,-2)));
        System.out.println(Arrays.toString(f(new char[]{}, 0,1)));

    }
}
