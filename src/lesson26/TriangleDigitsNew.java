package lesson26;

public class TriangleDigitsNew {

    public static void main(String[] args) {
        triangle(6);
        System.out.println("---------------");
        triangleTwo(6);
    }


    private static void triangleTwo(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(i + "");

            }
            System.out.println();
        }
    }

    private static void triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = i; j > 1; j--) {
                System.out.print(j + "");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "");
            }
            System.out.println();
        }
    }
}

