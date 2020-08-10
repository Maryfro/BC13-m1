package lesson36;

import java.util.Arrays;
import java.util.Random;

public class CharArraySolutionWithRandom {
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
        Random random = new Random();
        random.nextInt();
        for (int i = 0; i < charArray.length; i++) {
            int change = i + random.nextInt(charArray.length - i);
            swap(charArray, i, change);
        }
        System.out.println(Arrays.toString(charArray));
    }

    private static void swap(char[] a, int i, int change) {
        char temp = a[i];
        a[i] = a[change];
        a[change] = temp;
    }
}

