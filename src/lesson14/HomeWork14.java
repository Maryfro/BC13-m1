package lesson14;

public class HomeWork14 {
    public static void main(String[] args) {
        System.out.println(minCat("hello", "hi"));
        System.out.println(minCat("hello", "java"));
        System.out.println(minCat("java", "hello"));
        System.out.println("------------------------------");
        System.out.println(doubleChar("The"));
        System.out.println(doubleChar("AAbb"));
        System.out.println(doubleChar("Hi-There"));
        System.out.println("------------------------------");
        System.out.println(loneSum(1, 2, 3));
        System.out.println(loneSum(3, 2, 3));
        System.out.println(loneSum(3, 3, 3));
        System.out.println("------------------------------");
        System.out.println(sumDigits(123));
        System.out.println(sumDigits(768));

    }

    public static String minCat(String one, String two) {
        if (one.length() > two.length()) {
            return one.substring(one.length() - two.length(), one.length()) + two;
        } else if (one.length() < two.length()) {
            return one + two.substring(two.length() - one.length(), two.length());
        }
        return one + two;

    }

    public static String doubleChar(String s) {
        String output = "";
        for (int i = 0; i < s.length(); i++) {
            output = output + s.substring(i, i + 1) + s.substring(i, i + 1);

        }

        return output;
    }

    public static int loneSum(int a, int b, int c) {
        if (a != b && b != c && c != a) {
            return a + b + c;
        } else if (a == b && b == c && c == a) {
            return 0;
        } else if (a == b) {
            return c;
        } else if (b == c) {
            return a;
        } else {
            return b;
        }
    }

    public static int sumDigits(int x) {
        String temp = String.valueOf(x);
        String empty = "";
        int result = 0;
        for (int i = 0; i < temp.length(); i++) {
            empty = temp.substring(i, i + 1);
            x = Integer.parseInt(empty);
            result += x;
        }

        return result;
    }
}

