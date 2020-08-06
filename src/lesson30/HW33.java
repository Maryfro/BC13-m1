package lesson30;

public class HW33 {
    public static void main(String[] args) {
        int[] b1 = new int[]{4, 5, 6};
        int[] b2 = new int[]{1, 2,};
        int[] b3 = new int[]{3};
        HW32.myArrayPrint(makeLast(b1));// [0,0,0,0,0,6]
        HW32.myArrayPrint(makeLast(b2));// [0,0,0,2]
        HW32.myArrayPrint(makeLast(b3));// [0,3]
    }

    public static int[] makeLast(int[] input) {
        int[] output = new int [input.length * 2];
        output[output.length-1] = input[input.length-1];
        return output;
    }
}
