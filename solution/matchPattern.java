package solution;

public class matchPattern {
    static int f(int[] a, int len, int[] pattern, int patternLen) {
        int k = 0;
        int i = 0;
        int match = 0;
        for (i = 0; i < len; i++){
            if (a[i] == pattern[k]){
                match++;
            }else if(match == 0 || k == patternLen - 1){
                return 0;
            }else{
                if(k != patternLen - 1){
                    k++;
                    i--;
                }
            }
        }
        if(i == len && k == patternLen - 1){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args){
        System.out.println(f(new int[]{1,1,1,2,2,1,1,3}, 8,new int[]{1,2,1,3}, 4));
    }
}
