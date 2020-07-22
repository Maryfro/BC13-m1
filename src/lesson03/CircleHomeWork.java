package lesson03;

public class CircleHomeWork {
    public static void main(String[] args) {
        FindSquareCircle();
        FindCircumference();
        FindEurotoDollar();
        AreaBelarusToUkraine();
        AreaMoscowToBerlin();
        BankProfit();

    }

    public static void FindSquareCircle() {
        double r = 5.5;
        double square = Math.PI * Math.pow(r, 2);
        System.out.println("square " + square);
    }

    public static void FindCircumference() {
        double r = 5.5;
        double circumference = Math.PI * 2 * r;
        System.out.println("circumference " + circumference);

    }

    public static void FindEurotoDollar() {
        double dollar = 1.0;
        double euro = 1.1;
        euro = 1.1 * dollar;
        System.out.println(euro);

    }

    public static void AreaBelarusToUkraine() {
        double area_Belarus = 207.595;
        double area_Ukraine = 603.628;
        double correlation = area_Belarus / area_Ukraine;
        System.out.println("correlation of area of Belarus to area of Ukraine: " + correlation);
    }

    public static void AreaMoscowToBerlin() {
        double area_Moscow = 2511;
        double area_Berlin = 891.8;
        int correlation = (int) (area_Moscow / area_Berlin);
        System.out.println("correlation of area of Moscow to area of Berlin: " + correlation);
    }

    public static void BankProfit() {
        double bank_balance = 1000;
        double future_balance = 1000 + 1000 * 0.035 * 7;
        System.out.println("future bank balance is " + future_balance);

    }


}

