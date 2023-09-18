package solution;

public class isDigitIncreasing {
    static int f(int n){
        int count = 0;
        int check = n;
        int digit,sum,result;
        //check n has how many digit
        while(n!=0){
            n/=10;
            count++;
        }
        //check 1 to 9, which number satisfy n = a + aa + aaa +....
        for(int i = 1; i <= 9; i++){
            digit = count;
            sum = 0;
            result = 0;
            while(digit!=0){
                sum = sum*10 + i;
                result += sum;
                digit--;
            }
            if(result == check) return 1;
        }
        return 0;
    }

    public static void main(String[] args){
        System.out.println(f(7));
        System.out.println(f(36));
        System.out.println(f(984));
        System.out.println(f(7404));
    }
}
