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

    private static int maxSpan(int[] input) {
        int span;
        int[] output = new int[input.length];
        for (int i = 0; i < i + 1; i++) {
            for (int j = i; j < input.length; j++) {
                if (input[i] == input[j]) {
                    span = j - i + 1;
                    output[i] = span;
                }
            }
        }
        int result = output[0];
        for (int j : output) {
            result = Math.max(result, j);
        }
        return result;
    }
}

