package Lesson25;

public class HelloBinary {

    public static void main(String[] args) {
        /*int a = 78;
        char b = '\u218A';
        System.out.println(b);
        System.out.println('\u218B');
         */
        System.out.println(convertToDecimal(1000));
        System.out.println(convertDecimalToBinary(8));
    }

    public static int convertToDecimal(int binaryDigit) {
        int decimalDigit = 0;
        int n = 0;
        int temp = 0;
        int moduloSystem = 10;
        while (binaryDigit > 0) {
            temp = binaryDigit % moduloSystem;
            decimalDigit += temp * Math.pow(2, n);
            binaryDigit = binaryDigit / moduloSystem;
            n++;
        }
        return decimalDigit;
    }

    public static String convertDecimalToBinary(int decimal) {
        int remainder;
        String output = "";
        while (decimal > 0) {
            remainder = (decimal % 2);
            output = Integer.toString(remainder) + output;
            decimal = decimal / 2;
        }
        return output;
    }
}
