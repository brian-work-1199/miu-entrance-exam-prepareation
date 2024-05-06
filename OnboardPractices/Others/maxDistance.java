package OnboardPractices.Others;

//Write a function called maxDistance that find the max distance between non-trivial factors of a number.
//Non-trivial means, neither 1 nor the number it self.
//For example: 12 has factors: 2, 3, 4, 6 -> max distance is 6-2 = 4.
//If the number has only one factor (e.g. 49 has only one factor which 7) the method should return 0.
//If the number has no factors (e.g. 13), the method should return -1

public class maxDistance {
    static int f(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) count++;
        }
        if (count == 1) return 0;
        if (count == 0) return -1;
        int[] arr = new int[count];
        int t = 0;
        for (int j = 2; j < n; j++) {
            if (n % j == 0){
               arr[t%4] = j;
               t++;
            }
        }
        return arr[count-1] - arr[0];
    }

    public static void main(String[] args) {
        System.out.println(f(12));
        System.out.println(f(13));
    }
}
