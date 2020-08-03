package lesson30;

public class HW30 {
    public static void main(String[] args) {
        System.out.println(findGreatestCommonDivisor(100, 40));
        System.out.println(findHighestCommonFactor(9, 12));
        System.out.println("----------------------------------");
        char[] firstArrayChar = new char[10];
        fillArrayChar(firstArrayChar);
           }

    private static int findGreatestCommonDivisor(int a, int b) {
        int divisor;
        int greatestDivisor = 1;
        for (int i = 1; i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                divisor = i;
                if (greatestDivisor < divisor) greatestDivisor = divisor;
            }
        }
        return greatestDivisor;
    }

    private static int findHighestCommonFactor(int a, int b) {
        for (int i = 1; i <= b; i++) {
            int factorA = a * i;
            if (factorA % a == 0 && factorA % b == 0) return factorA;
        }
        return 0;
    }

    private static void fillArrayChar(char[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = getRandomChar();
        }
    }

    public static char getRandomChar() {
        String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char symbol;
        symbol = (char) (input.codePointAt((int) (Math.random() * (input.length()))));
        System.out.print(symbol);
        return symbol;
    }

    /*public static void myArrayPrint(char[] arrayToPrint) {
        for (int j : arrayToPrint) {
            System.out.print(j + " ");
        }
        System.out.println();
    }*/
}

