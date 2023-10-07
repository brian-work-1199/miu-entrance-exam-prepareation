package solution;

public class areAnagrams {
    static int f(char [] a1, char [] a2){
        if (a1.length != a2.length) return 0;

        char[] a1Copy = new char[a1.length];
        char[] a2Copy = new char[a2.length];

        for(int i = 0; i < a1.length; i++){
            a1Copy[i] = a1[i];
            a2Copy[i] = a2[i];
        }

        for(int j = 0; j < a1.length; j++){
            for(int k = 0; k < a2.length; k++){
                if(a1Copy[j] == a2Copy[k]){
                    a1Copy[j] = ' ';
                    a2Copy[k] = ' ';
                }
            }
        }

        for(int l = 0; l < a1.length; l++){
            if(a1Copy[l] != ' ' || a2Copy[l] != ' ') return 0;
        }
        return 1;
    }
    public static void main(String[] args){
        System.out.println(f(new char[]{'s', 'i', 't'}, new char[]{'i', 't', 's'}));
        System.out.println(f(new char[]{'s', 'i', 't'}, new char[]{'i', 'd', 's'}));
        System.out.println(f(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 't'}));
        System.out.println(f(new char[]{'b', 'o', 'g'}, new char[]{'b', 'o', 'o'}));
        System.out.println(f(new char[]{}, new char[]{}));
        System.out.println(f(new char[]{'b', 'i', 'g'}, new char[]{'b', 'i', 'g'}));
    }
}
