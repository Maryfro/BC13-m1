package lesson19;

public class HW19 {
    public static void main(String[] args) {
        System.out.println(bobThere("abcbob"));
        System.out.println(bobThere("b9b"));
        System.out.println(bobThere("bac"));

    }

    public static boolean bobThere(String str) {
        char b = 'b';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == b && str.charAt(i + 2) == b) {
                count++;
            }
            if (count > 0) return true;
        }
        return false;
    }
}
