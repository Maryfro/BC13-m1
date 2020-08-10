package lesson36;

import java.util.Arrays;

public class HW36CharArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(createCharArray()));
        makeRandomChars(createCharArray());

    }

    private static char[] createCharArray() {
        char[] charArray = new char[33];
        String source = "А Б В Г Д Е Ё Ж З И Й К Л М Н О П Р С Т У Ф Х Ц Ч Ш Щ Ъ Ы Ь Э Ю Я";
        source = source.replace(" ", "");
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = source.charAt(i);
        }
        return charArray;
    }

    private static void makeRandomChars(char[] charArray) {
        char[] result = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            result[i] = charArray[(int) (Math.random() * charArray.length)];

        }

        System.out.println(Arrays.toString(result));
    }
}
