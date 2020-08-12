package lesson36;

public class Arrays0203 {
    public static void main(String[] args) {
        int[] a1 = new int[]{2, 1, 2, 3, 4}; //3
        int[] a2 = new int[]{2, 2, 0}; //3
        int[] a3 = new int[]{1, 3, 5}; //0
        System.out.println(countEvens(a1));
        System.out.println(countEvens(a2));
        System.out.println(countEvens(a3));
        System.out.println("--------------------");
         int[] b1 = new int[]{1, 2, 1, 1, 3}; //4
        int[] b2 = new int[]{1, 4, 2, 1, 4, 1, 4}; //6
        int[] b3 = new int[]{1, 4, 2, 1, 4, 4, 4}; //6
        System.out.println(maxSpan(b1));
        System.out.println(maxSpan(b2));
        System.out.println(maxSpan(b3));
    }

    private static int maxSpan(int[] array) {
        int spanLast = 0;
        int spanFirst = 0;
        int found = 0;
        int found2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[array.length - 1]) {
                found++;
                if (found == 1) spanLast = array.length - i;
            }
        }
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] == array[0]) {
                found2++;
                if (found2 == 1) spanFirst = i + 1;
            }
        }
        if (spanFirst >= spanLast) return spanFirst;
        return spanLast;
    }

    private static int countEvens(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) count++;
        }
        return count;
    }
}
