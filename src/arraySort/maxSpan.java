package arraySort;

import java.util.Arrays;

public class maxSpan {
    public static void main(String[] args) {
        int[] b1 = new int[]{1, 2, 1, 1, 3}; //4
        int[] b2 = new int[]{1, 4, 2, 1, 4, 1, 4, 9, 2, 5}; //7
        int[] b3 = new int[]{1, 4, 2, 1, 4, 4, 4}; //6
        System.out.println(maxSpan(b1));
        System.out.println(maxSpan(b2));
        System.out.println(maxSpan(b3));
    }

    private static int maxSpan(int[] array) {
        int span;
        int[] arr = new int[array.length];
        for (int i = 0; i < i + 1; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j]) {
                    span = j - i + 1;
                    arr[i] = span;
                }
            }
        }
        int result = arr[0];
        for (int j : arr) {
            result = Math.max(result, j);
        }
        return result;
    }
}

