package OnboardPractices.Pattern;

public class areAnagrams {

    static int f(char[] a1, char[] a2){
        if(a1.length != a2.length) return 0;

        char[] copy1 = new char[a1.length];
        char[] copy2 = new char[a2.length];

        for(int i = 0; i < a1.length; i++){
            copy1[i] = a1[i];
            copy2[i] = a2[i];
        }

        for(int j = 0; j < copy1.length; j++){
            for(int k = 0; k < copy2.length; k++){
                if(copy1[j] == copy2[k]){
                    copy1[j] = ' ';
                    copy2[k] = ' ';
                }
            }
        }

        for(int t = 0; t < copy1.length; t++){
            if(copy1[t] != ' ' || copy2[t] != ' ') return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(f(new char[]{'s', 'i', 't'}, new char[]{'i', 't', 's'}));
        System.out.println(f(new char[]{'s', 'i', 't'}, new char[]{'i', 'd', 's'}));
        System.out.println(f(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 't'}));
        System.out.println(f(new char[]{'b', 'o', 'g'}, new char[]{'b', 'o', 'o'}));
        System.out.println(f(new char[]{}, new char[]{}));
        System.out.println(f(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 'g'}));
    }
}
