package lesson36;

import java.util.Arrays;

public class HW36CharArray {
    public static void main(String[] args) {
        char[] newCyrillicArray = createCharArray();
        System.out.println(Arrays.toString(newCyrillicArray));
        char[] shakeArray = makeRandomChars(newCyrillicArray);
        System.out.println(Arrays.toString(shakeArray));
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

    private static char[] makeRandomChars(char[] arrayToShake) {
        char[] result = new char[arrayToShake.length];
        for (int i = 0; i < arrayToShake.length; i++) {
            int random = (int) (Math.random() * arrayToShake.length);
            while (result[random] != 0) {
                random = (int) (Math.random() * arrayToShake.length);
            }
            result[random] = arrayToShake[i];
        }

        return result;
    }

}

