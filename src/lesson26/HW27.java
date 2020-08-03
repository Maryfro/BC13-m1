package lesson26;

public class HW27 {
    public static void main(String[] args) {
        System.out.println(starOut("ab*cd")); // → "ad"
        System.out.println(starOut("ab**cd")); // → "ad"
        System.out.println(starOut("sm*eilly")); // → → "silly"
        System.out.println("--------------------");
        System.out.println(countHi("abc hi ho"));
        System.out.println(countHi("ABChi hi"));
        System.out.println(countHi("hihi"));
    }

    private static int countHi(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'h' && s.charAt(i + 1) == 'i') count++;
        }
        return count;
    }

    private static String starOut(String str) {
        String output = "";
        char star = '*';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == star && str.charAt(i - 1) != star) {  // логическая ловушка
                output = str.substring(0, i - 1) + str.substring(i + 2);
            } else if (str.charAt(i) == star && str.charAt(i - 1) == star) {
                output = str.substring(0, i - 2) + str.substring(i + 2);
            }
        }
        return output;
    }
}

