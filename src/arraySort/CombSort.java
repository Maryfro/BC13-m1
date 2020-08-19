package arraySort;

import java.util.Arrays;

public class CombSort {
    public static void main(String[] args) {
        int[] originalArray = createArray(20);
        System.out.println(Arrays.toString(originalArray));
        combSort(originalArray);
        System.out.println(Arrays.toString(combSort(originalArray)));
    }

    private static int[] combSort(int[] arr) {
        double factor = 1.24733095;
        int step = arr.length;
        while (step > 1) {
            step = (int) (step / factor);
            //System.out.println("step after factor " + step);
            for (int i = 0; step + i < arr.length; i++) {
                if (arr[i] > arr[i + step]) {
                    swap(arr, i, i + step);
                }
            }
        }
        return arr;
    }

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    private static int[] createArray(int length) {
        int[] output = new int[length];
        for (int i = 0; i < length; i++) {
            output[i] = (int) (Math.random() * 100);
        }
        return output;
    }
}
