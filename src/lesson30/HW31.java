package lesson30;

public class HW31 {

    public static void main(String[] args) {
        int[] b1 = new int[]{1, 2, 3}; // exp. [3, 2, 1]
        int[] b2 = new int[]{5, 11, 9}; // exp. [9,11, 5]
        int[] b3 = new int[]{7, 0, 0}; // exp. [0, 0, 7]
        GoodMorningArray.myArrayPrint(reverse3(b1));
        GoodMorningArray.myArrayPrint(reverse3(b2));
        GoodMorningArray.myArrayPrint(reverse3(b3));
        System.out.println("-------------------------------------");
        int[] mc1 = new int[]{1, 2, 3};
        int[] mc2 = new int[]{4, 5, 6};
        int[] kc1 = new int[]{7, 7, 7};
        int[] kc2 = new int[]{3, 8, 0};
        int[] nc1 = new int[]{5, 2, 9};
        int[] nc2 = new int[]{1, 4, 5};
        GoodMorningArray.myArrayPrint(middleWay(mc1, mc2)); // exp. [2,5]
        GoodMorningArray.myArrayPrint(middleWay(kc1, kc2)); // exp. [7,8]
        GoodMorningArray.myArrayPrint(middleWay(nc1, nc2)); // exp. [2,4]
    }

    private static int[] reverse3(int[] b) {
        b = new int[]{b[b.length - 1], b[b.length - 2], b[0]};
        return b;
    }

    public static int[] middleWay(int[] a, int[] b) {
        return new int[]{a[1], b[1]};
    }
}

