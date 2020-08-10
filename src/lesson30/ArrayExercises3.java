package lesson30;

import java.util.Arrays;

public class ArrayExercises3 {
    public static void main(String[] args) {
        int[] b1 = new int[]{1, 2, 3, 4}; // 4,2,3,1
        int[] b2 = new int[]{1, 2, 3}; // 3, 2, 1
        int[] b3 = new int[]{8, 6, 7, 9, 5}; //5, 6, 7, 9, 8
        System.out.println(Arrays.toString(swapEnds(b1)));
        System.out.println(Arrays.toString(swapEnds(b2)));
        System.out.println(Arrays.toString(swapEnds(b3)));
        System.out.println("--------------------------");
        int[] c1 = new int[]{1, 2, 3}; // 1,2
        int[] c2 = new int[]{1, 2}; // 1,2
        int[] c3 = new int[]{1}; // 1
        System.out.println(Arrays.toString(frontPiece(c1)));
        System.out.println(Arrays.toString(frontPiece(c2)));
        System.out.println(Arrays.toString(frontPiece(c3)));
        System.out.println("--------------------------");
        int[] d1 = new int[]{1, 2, 3};
        int[] d2 = new int[]{1};
        int[] d3 = new int[]{1, 7};
        int[] e1 = new int[]{7, 9, 8};
        int[] e2 = new int[]{2};
        int[] e3 = new int[]{};
        System.out.println(Arrays.toString(front11(d1, e1))); // 1,7
        System.out.println(Arrays.toString(front11(d2, e2))); // 1, 2
        System.out.println(Arrays.toString(front11(d3, e3))); // 1
    }

    public static int[] swapEnds(int[] a) {
        int temp = a[0];
        a[0] = a[a.length - 1];
        a[a.length - 1] = temp;
        return a;
    }

    public static int[] frontPiece(int[] a) {
        if (a.length < 2) return a;
        int[] output = new int[2];
        output[0] = a[0];
        output[1] = a[1];
        return output;
    }

    public static int[] front11(int[] a, int[] b) {
        int[] output = new int[1];
        int[] output2 = new int[2];
        if (a.length == 0) {
            output[0] = b[0];
        } else if (b.length == 0) {
            output[0] = a[0];
            return output;
        } else
            output2[0] = a[0];
        output2[1] = b[0];
        return output2;
    }

}
