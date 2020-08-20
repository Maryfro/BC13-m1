package arraySort;

import java.util.Arrays;

public class HW44 {
    public static void main(String[] args) {
        System.out.println(containsMethod("I love java", "love")); //Returns true if and only if this string contains
        // the specified sequence of char values.
        System.out.println(containsMethod("I love java", "Love"));
        System.out.println("-----------------------------------------");
        System.out.println(endsWithMethod("six", "ix")); //Tests if this string ends with the specified suffix.
        System.out.println(endsWithMethod("miss", "ix"));
        System.out.println("-----------------------------------------");
        System.out.println(equalsMethod("miss", "miss")); // Compares this string to the specified object.
        System.out.println(equalsMethod("miss", "kiss"));
        System.out.println("-----------------------------------------");
        System.out.println(equalsIgnoreCaseMethod("miss", "Miss")); // Compares this String to another String, ignoring case considerations.
        System.out.println(equalsIgnoreCaseMethod("mISS", "miss"));
        System.out.println("-----------------------------------------");
        System.out.println(isEmptyMethod("miss")); // Returns true if, and only if, length() is 0.
        System.out.println(isEmptyMethod(""));
        System.out.println("-----------------------------------------");
        System.out.println(lengthMethod("I love java")); // Returns the length of this string.
        System.out.println(lengthMethod(""));
        System.out.println("-----------------------------------------");
        System.out.println(replaceMethod("I love java", 'I', 'U')); // Returns a string resulting from replacing all occurrences of oldChar in this string with newChar.
        System.out.println("-----------------------------------------");
        System.out.println(startsWithMethod("miss", "mi")); // Tests if this string starts with the specified prefix.
        System.out.println(startsWithMethod("kiss", "mi"));
        System.out.println("-----------------------------------------");
        System.out.println(substringMethod("I love java", 2)); // Returns a string that is a substring of this string.
        System.out.println("-----------------------------------------");
        System.out.println(toLowerCaseMethod("I LOVE java")); // Converts all of the characters in this String to lower case.
        System.out.println(toUpperCaseMethod("I LOVE java")); // Converts all of the characters in this String to upper case.
        System.out.println("-----------------------------------------");
        System.out.println(trimMethod("            I love java                       ")); // Returns a string whose value is this string, with any leading and trailing whitespace removed.
        System.out.println("-----------------------------------------");
        System.out.println(charAt("I love java", 0)); // Returns the char value at the specified index.
        System.out.println("-----------------------------------------");
        System.out.println(codePointAt( "b", 0)); // Returns the character (Unicode code point) at the specified index.
        System.out.println("-----------------------------------------");
        System.out.println(codePointBefore( "ab", 1)); // Returns the character (Unicode code point) before the specified index.
        System.out.println("-----------------------------------------");
        System.out.println(codePointCount( "!§23 45zbsasd fasdvc $&", 1, 15)); // Returns the number of Unicode code points in the specified text range of this String.
        System.out.println("-----------------------------------------");
        System.out.println(indexOf( "!§23 45zbsasd fasdvc $&", '§')); //Returns the index within this string of the first occurrence of the specified character.
        System.out.println("-----------------------------------------");
        System.out.println(Arrays.toString(toCharArray("I love java"))); // Converts this string to a new character array.

    }
    public static char[] toCharArray(String one){
        return one.toCharArray();
    }

    public static int indexOf (String one, char ch){
        return one.indexOf(ch);
    }

    public static char charAt(String one, int index) { return one.charAt(index); }

    public static int codePointAt(String one, int index) {
        return one.codePointAt(index);
    }
    public static int codePointBefore(String one, int index) {
        return one.codePointBefore(index);
    }

    public static int codePointCount(String one, int startIndex, int endIndex) {
        return one.codePointCount(startIndex, endIndex);
    }

    public static boolean containsMethod(String one, CharSequence two) { return one.contains(two); }

    public static boolean endsWithMethod(String one, String two) {
        return one.endsWith(two);
    }

    public static boolean equalsMethod(String one, String two) { return one.equals(two); }

    public static boolean equalsIgnoreCaseMethod(String one, String two) {
        return one.equals(two);
    }

    public static boolean isEmptyMethod(String one) {
        return one.isEmpty();
    }

    public static int lengthMethod(String one) {
        return one.length();
    }

    public static String replaceMethod(String one, char old, char gold) {
        return one.replace(old, gold);
    }

    public static boolean startsWithMethod(String one, String two) {
        return one.startsWith(two);
    }

    public static String substringMethod(String one, int index) {
        return one.substring(index);
    }

    public static String toLowerCaseMethod(String one) {
        return one.toLowerCase();
    }

    public static String toUpperCaseMethod(String one) {
        return one.toUpperCase();
    }

    public static String trimMethod(String one) {
        return one.trim();
    }
}

