package arraySort;

import java.util.Arrays;

public class CocktailSortByte {
    public static void main(String[] args) {
        byte[] b = createArray(10);
        System.out.println("initial array " + Arrays.toString(b));
        byte[] copyB = makeCopy(b);
        //System.out.println(Arrays.toString(copyB));
        byte[] bubbleArray = bubbleSort(copyB);
        System.out.println("bubble sort" + Arrays.toString(bubbleArray));
        byte[] copyB2 = makeCopy(b);
        System.out.println("cocktail sort" + Arrays.toString(cocktailSort(copyB2)));
    }

    private static byte[] cocktailSort(byte[] copyB2) {
        int start = 0;
        int end = copyB2.length - 1;
        while (start <= end) {
            boolean sorted = false;
            for (int i = start; i < end; i++) {
                if (copyB2[i] > copyB2[i + 1]) {
                    byte temp = copyB2[i];
                    copyB2[i] = copyB2[i + 1];
                    copyB2[i + 1] = temp;
                    sorted = true;
                }
            }
            end--;
            for (int i = end; i > start; i--) {
                if (copyB2[i] < copyB2[i - 1]) {
                    byte temp = copyB2[i];
                    copyB2[i] = copyB2[i - 1];
                    copyB2[i - 1] = temp;
                    sorted = true;
                }
            }
            start++;
            if (!sorted) break;
        }
        return copyB2;
    }

    private static byte[] bubbleSort(byte[] copyB) {
        int count = 0;
        for (int i = 0; i < copyB.length - 1; i++) {
            if (copyB[i] > copyB[i + 1]) {
                byte temp = copyB[i];
                copyB[i] = copyB[i + 1];
                copyB[i + 1] = temp;
                count++;
            }
            if (count > 0) {
                bubbleSort(copyB);
            }
        }
        return copyB;
    }

    private static byte[] makeCopy(byte[] b) {
        byte[] copy = new byte[b.length];
        for (int i = 0; i < b.length; i++) {
            copy[i] = b[i];
        }
        return copy;
    }


    private static byte[] createArray(int length) {
        byte[] b = new byte[length];
        byte min = -128;
        byte max = 127;
        for (int i = 0; i < b.length; i++) {
            b[i] = (byte) (Math.random() * ((max - min) + 1) + min);
        }
        return b;
    }
}
