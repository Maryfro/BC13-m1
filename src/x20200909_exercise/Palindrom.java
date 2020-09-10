package x20200909_exercise;

public class Palindrom {
    // given a long, check if it is a palindrom
    public static void main(String[] args) {
        System.out.println(isPalindrom(912345));
        System.out.println(isPalindrom(912219));
    }

    public static boolean isPalindrom(long number) {
        String input = "";
        String reversed = "";
        input = String.valueOf(number);
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }
        if (input.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }
}
