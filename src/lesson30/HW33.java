package lesson30;

public class HW33 {
    public static void main(String[] args) {
        int[] b1 = new int[]{4, 5, 6};
        int[] b2 = new int[]{1, 2,};
        int[] b3 = new int[]{3};
        HW32.myArrayPrint(makeLast(b1));// [0,0,0,0,0,6]
        HW32.myArrayPrint(makeLast(b2));// [0,0,0,2]
        HW32.myArrayPrint(makeLast(b3));// [0,3]
        System.out.println("-------------------------");
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{7, 2, 3};
        int[] a3 = new int[]{1, 2};
        int[] c1 = new int[]{1, 3};
        int[] c2 = new int[]{1};
        int[] c3 = new int[]{};
        System.out.println(start1(a1, c1)); //2
        System.out.println(start1(a2, c2));//1
        System.out.println(start1(a3, c3));//1
        System.out.println("-------------------------");
        int[] d1 = new int[]{1, 2};
        int[] d2 = new int[]{4, 4};
        int[] d3 = new int[]{9, 2};
        int[] e1 = new int[]{3, 4};
        int[] e2 = new int[]{2, 2};
        int[] e3 = new int[]{3, 4};
        HW32.myArrayPrint(plusTwo(d1, e1));// [1,2, 3, 4]
        HW32.myArrayPrint(plusTwo(d2, e2));// [4,4,2,2]
        HW32.myArrayPrint(plusTwo(d3, e3));// [9,2,3,4]
        System.out.println("-------------------------");
        int[] f1 = new int[]{1, 2, 3};
        int[] f2 = new int[]{1, 5, 3};
        int[] f3 = new int[]{5, 2, 3};
        System.out.println(maxTriple(f1)); //3
        System.out.println(maxTriple(f2)); //5
        System.out.println(maxTriple(f3)); //5
        System.out.println("-------------------------");
        HW32.myArrayPrint(makePi());
    }

    public static int[] makeLast(int[] input) {
        int[] output = new int[input.length * 2];
        output[output.length - 1] = input[input.length - 1];
        return output;
    }

    public static int start1(int[] a, int[] b) {
        if (a.length == 0 && b[0] == 1) return b[0];
        if (b.length == 0 && a[0] == 1) return a[0];
        if (a[0] == 1 && b[0] == 1) return a[0] + b[0];
        else if (b[0] == 1) return b[0];
        else if (a[0] == 1) return a[0];
        return 0;
    }

    public static int[] plusTwo(int[] a, int[] b) {
        int[] output = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            output[i] = a[i];
            output[output.length - 1 - i] = b[b.length - 1 - i];
        }
        return output;
    }

    public static int maxTriple(int[] array) {
        if (array[0] > array[1] && array[0] > array[array.length - 1]) return array[0];
        else if (array[1] > array[array.length - 1]) return array[1];
        return array[array.length - 1];
    }

    public static int[] makePi() {
        int[] output = new int[3];
        String pi = String.valueOf((int) (Math.PI * 100));
        for (int i = 0; i < output.length; i++) {
            output[i] = Integer.parseInt(pi.substring(i, i + 1));

        }
        return output;
    }


}

