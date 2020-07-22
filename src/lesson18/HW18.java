package lesson18;

public class HW18 {
    public static void main(String[] args) {
        ab(3, 5);
        abTwo(3, 5);
        abThree(5, 17);
        abFour(5, 17);
        triangle("*");
        triangleDoWhile("*");

    }

    public static void ab(int a, int b) {
        int i = 0;
        while (i < b) {
            System.out.println(a);
            i++;
        }
    }

    public static void abTwo(int a, int b) {
        int i = 0;
        do {
            System.out.println(a);
            i++;
        } while (i < b);
    }

    public static void abThree(int a, int b) {
        while (a <= b) {
            System.out.println(a);
            a++;

        }
    }

    public static void abFour(int a, int b) {
        do {
            System.out.println(a);
            a++;
        } while (a <= b);
    }


    public static void triangle(String star) {
        int i = 0;
        String result = "";
        while (i < 10) {
            result += star;
            System.out.println(result);
            i++;
        }
    }

    public static void triangleDoWhile(String star) {
        int i = 0;
        String result = "";
        do {
            result += star;
            System.out.println(result);
            i++;
        } while (i < 10);
    }
}
