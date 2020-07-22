package lesson02;

public class ReviewInteger {
    public static void main(String[] args) {

        findSquareCube();
        CalculateGrains();
        test(9, 2);
    }

    public static void findSquareCube() {
        int a = 5;
        int square = 6 * a * a;
        System.out.println("square = " + square);

    }

    public static void CalculateGrains() {
        long total = (long) (Math.pow(2, 64)) - 1;
        System.out.println(total + " grains on chessboard");
    }
    public static void test(int a, int b){
        System.out.println(a/b);
    }
}

