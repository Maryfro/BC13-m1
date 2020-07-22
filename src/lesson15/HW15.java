package lesson15;

public class HW15 {
    public static void main(String[] args) {
        System.out.println(containsMethod("I love java", "love"));
        System.out.println(containsMethod("I love java", "Love"));
        System.out.println("-----------------------------------------");
        System.out.println(endsWithMethod("six", "ix"));
        System.out.println(endsWithMethod("miss", "ix"));
        System.out.println("-----------------------------------------");
        System.out.println(equalsMethod("miss", "miss"));
        System.out.println(equalsMethod("miss", "kiss"));
        System.out.println("-----------------------------------------");
        System.out.println(equalsIgnoreCaseMethod("miss", "Miss"));
        System.out.println(equalsIgnoreCaseMethod("mISS", "miss"));
        System.out.println("-----------------------------------------");
        System.out.println(isEmptyMethod("miss"));
        System.out.println(isEmptyMethod(""));
        System.out.println("-----------------------------------------");
        System.out.println(lengthMethod("I love java"));
        System.out.println(lengthMethod(""));
        System.out.println("-----------------------------------------");
        System.out.println(replaceMethod("I love java", 'I', 'U'));
        System.out.println("-----------------------------------------");
        System.out.println(startsWithMethod("miss", "mi"));
        System.out.println(startsWithMethod("kiss", "mi"));
        System.out.println("-----------------------------------------");
        System.out.println(substringMethod("I love java", 2));
        System.out.println("-----------------------------------------");
        System.out.println(toLowerCaseMethod("I LOVE java"));
        System.out.println(toUpperCaseMethod("I LOVE java"));
        System.out.println("-----------------------------------------");
        System.out.println(trimMethod("            I love java                       "));



    }

    public static boolean containsMethod(String one, CharSequence two) {
        return one.contains(two);
    }

    public static boolean endsWithMethod(String one, String two) {
        return one.endsWith(two);
    }

    public static boolean equalsMethod(String one, String two) {
        return one.equals(two);

    }

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

    public static String trimMethod(String one){
        return one.trim();
    }
}
