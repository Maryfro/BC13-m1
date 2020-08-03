package lesson22;

public class EnigmaTest {
    public static void main(String[] args) {
        enigmaTest("АБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ");
    }

    /*     test("Съешь_же_ещё_этих мягких французских булок, да выпей чаю.");
     }

     private static void test(String input) {
         for (int i = 0; i < input.length(); i++) {
             char symbol;
             if (input.charAt(i) == '_') {
                 symbol = (char) (input.codePointAt(i));
                 System.out.println(symbol);
             }*/
    public static void enigmaTest(String s) {
        int value = 0;
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            value = s.codePointAt(i);
            System.out.println(s.substring(i, i + 1) + " " + value);
        }
    }
}



    /*private static String enigmaCeasar(String input) {
        int key = 3;
        String output = "";
        char symbol;
        for (int i = 0; i <= input.length(); i++) {
            if (input.charAt(i) == ' ') {
                symbol = (char) (input.codePointAt(i));
            } else if (input.charAt(i) == '.') {
                symbol = (char) (input.codePointAt(i));
           *//* } else if (input.codePointAt(i) >= 1103) {
            symbol = (char) ((input.codePointAt(i) - 31) + key);*//*
            } else {
                symbol = (char) (input.codePointAt(i) + key);
                System.out.print(symbol);
            }
        }*/