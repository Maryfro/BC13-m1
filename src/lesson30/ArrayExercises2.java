package lesson30;

import java.util.Arrays;

public class ArrayExercises2 {
    public static void main(String[] args) {
     /*   int[] b1 = new int[]{1, 2, 3}; // 3,2,1
        int[] b2 = new int[]{5, 11, 9}; // 9,11,5
        int[] b3 = new int[]{7, 0, 0}; //0,0,7
        HW32.myArrayPrint(rotateLeft3(b1));
        HW32.myArrayPrint(rotateLeft3(b2));
        HW32.myArrayPrint(rotateLeft3(b3));
        System.out.println("---------------------");
        int[] c1 = new int[]{1, 2, 3}; // 3
        int[] c2 = new int[]{1, 1}; // 2
        int[] c3 = new int[]{1, 1, 1, 1}; // 2
        System.out.println(sum2(c1));
        System.out.println(sum2(c2));
        System.out.println(sum2(c3));
        System.out.println("---------------------");
        int[] d1 = new int[]{2, 5}; // true
        int[] d2 = new int[]{4, 3}; // true
        int[] d3 = new int[]{4, 5}; // false
        System.out.println(has23(d1));
        System.out.println(has23(d2));
        System.out.println(has23(d3));
        int[] e1 = new int[]{2, 2}; // true
        int[] e2 = new int[]{3, 3}; // true
        int[] e3 = new int[]{2, 3}; // false
        System.out.println("---------------------");
        System.out.println(double23(e1));
        System.out.println(double23(e2));
        System.out.println(double23(e3));
        System.out.println("---------------------");*/
        int[] f1 = new int[]{1, 2};
        int[] f2 = new int[]{3, 4};
        int[] f3 = new int[]{1, 1};
        int[] g1 = new int[]{3, 4};
        int[] g2 = new int[]{1, 2};
        int[] g3 = new int[]{1, 2};
        System.out.println(Arrays.toString(biggerTwo(f1, g1))); // 3, 4
        System.out.println(Arrays.toString(biggerTwo(f2, g2))); // 3, 4
        System.out.println(Arrays.toString(biggerTwo(f3, g3))); // 1, 2
    }

    private static int[] rotateLeft3(int[] a) {
        int[] output = new int[3];
        for (int i = 0; i < a.length; i++) {
            output[i] = a[a.length - 1 - i];
        }
        return output;
    }

    public static int sum2(int[] a) {
        return a[0] + a[1];
    }

    public static boolean has23(int[] a) {
        if (a[0] == 2 || a[0] == 3) return true;
        else if (a[1] == 2 || a[1] == 3) return true;
        return false;
    }

    public static boolean double23(int[] a) {
        return (a[0] == 2 && a[1] == 2) || (a[0] == 3 && a[1] == 3);
    }

    public static int[] biggerTwo(int[] a, int[] b) {
        if (a[0] + a[1] > b[0] + b[1]) return a;
        if (a[0] + a[1] < b[0] + b[1]) return b;
        return a;
    }
}
