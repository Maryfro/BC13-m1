package lesson03;

public class RoundUp {
    public static void main(String[] args) {
        double testVariable = Math.PI;
        double myNewVariable = roundUp(testVariable);
        System.out.println(myNewVariable);
        double anotherVariable = 9.856678;
        System.out.println(roundUp(anotherVariable));

    }


    public static double roundUp(double digitsToRound) {
        double temp0 = digitsToRound * 100;
        int temp1 = (int) temp0;
        temp0 = temp1;
        temp0 = temp0 / 100;
        return temp0;
    }
}

