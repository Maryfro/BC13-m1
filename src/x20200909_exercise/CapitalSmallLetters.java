package x20200909_exercise;

public class CapitalSmallLetters {
    // given a string with capital letters, small letters and symbols, return a string with capital letters turned
    // into small, ans small into capital. Symbols remain unchanged.
    public static void main(String[] args) {
        System.out.println(makeCapitalAndSmallLetters("AbRa CaDaBrA!?*"));
    }

    public static String makeCapitalAndSmallLetters(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                result += input.substring(i, i + 1).toLowerCase();
            }
            else {
                result += input.substring(i, i + 1).toUpperCase();
            }
        }
        return result;
    }
}
