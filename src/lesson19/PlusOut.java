package lesson19;

public class PlusOut {
    public static void main(String[] args) {
        System.out.println(plusOut("12xy34", "xy"));
        System.out.println(plusOut("12xy23", "1"));
        System.out.println(plusOut("12xy34xyabcxy", "xy"));


    }

    public static String plusOut(String s1, String s2) {
        String result = "";
        for (int i = 0; i < s1.length(); i++) {
            result = result + "+";
        }
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s2.charAt(j) == s1.charAt(i)) {
                    result = myReplace(result, s2.charAt(j), i);
                }
            }
        }
        return result;
    }

    public static String myReplace(String input, char toReplace, int index) {
        input = input.substring(0, index) + toReplace + input.substring(index + 1);
        return input;
    }
}
