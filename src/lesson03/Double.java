package lesson03;

public class Double {
    public static void main(String[] args) {
        HelloDouble();
        FindSquareCircle();
        HelloDoubleTwo();

    }

    public static void HelloFloat() {
        float a, b, c, d;
        a = (float) 10.2;
        b = 3.5F;
        c = 6.3434f;
        d = a + b + c;

    }

    public static void HelloDouble() {
        double a, b, c;
        int d, f, e;
        d = 10;
        f = 1000;
        e = d / f;
        System.out.println(e);

        a = 10.0;
        b = 20.0;
        c = a / b;
        System.out.println(c);
    }

    public static void FindSquareCircle() {
        final double PI = 3.14;
        double r = 5.5;
        double square = Math.PI * Math.pow(r, 2);
        System.out.println(square);
    }

    public static void HelloDoubleTwo() {
        double a = 10;
        double b = 5;
        System.out.println(Math.pow(b, a));


        }
    }

