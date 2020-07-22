package lesson10;

public class StartHiTest {
    public static void main(String[] args) {
        System.out.println(startHi("hi there"));
        System.out.println(startHi("hello hi"));
    }

    public static boolean startHi(String input) {
        String result = input.substring(0, 2);
        String resultOne = result + input.substring(2);
        if (input.startsWith("hi")) {
            return true;
        } else {
            return false;
        }
    }
}