package lesson30;

public class HW32 {
    public static void main(String[] args) {
        int[] b1 = new int[]{1, 2, 3, 4, 5};
        int[] b2 = new int[]{8, 6, 7, 5, 3, 0, 9};
        int[] b3 = new int[]{1, 2, 3};
        myArrayPrint(midThree(b1)); //[2, 3, 4]
        myArrayPrint(midThree(b2)); //[7, 5, 3]
        myArrayPrint(midThree(b3)); //[1, 2, 3]
        System.out.println("----------------------");
        int[] c1 = new int[]{1, 3, 4, 5};
        int[] c2 = new int[]{2, 1, 3, 4, 5};
        int[] c3 = new int[]{1, 1, 1};
        System.out.println(unlucky1(c1)); // true
        System.out.println(unlucky1(c2)); // true
        System.out.println(unlucky1(c3)); // false
        System.out.println("----------------------");
        int[] d1 = new int[]{1, 2, 3};
        int[] d2 = new int[]{1, 2, 3, 1};
        int[] d3 = new int[]{1, 2, 1};
        System.out.println(sameFirstLast(d1));// → false
        System.out.println(sameFirstLast(d2));// → true
        System.out.println(sameFirstLast(d3)); // → true
        System.out.println("----------------------");
        int[] f1 = new int[]{1, 2, 3};
        int[] f2 = new int[]{5, 11, 2};
        int[] f3 = new int[]{7, 0, 0};
        System.out.println(sum3(f1));// → 6
        System.out.println(sum3(f2)); //→ 18
        System.out.println(sum3(f3));// → 7
    }

    private static int sum3(int[] f) {
        return f[0] + f[1] + f[f.length - 1];
    }

    private static boolean sameFirstLast(int[] d) {
        return d[0] == d[d.length - 1];
    }

    private static boolean unlucky1(int[] c) {
        return c[0] == 1 && c[1] == 3 || c[1] == 1 && c[2] == 3 || c[c.length - 2] == 1 && c[c.length - 1] == 3;
    }

    private static int[] midThree(int[] b) {
        int[] output = new int[3];
        output[0] = b[b.length / 2 - 1];
        output[1] = b[b.length / 2];
        output[2] = b[b.length / 2 + 1];
        return output;

    }

    public static void myArrayPrint(int[] arrayToPrint) {
        for (int j : arrayToPrint) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

}

