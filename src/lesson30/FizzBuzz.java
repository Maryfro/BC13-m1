package lesson30;

import java.util.Arrays;

public class FizzBuzz {
    public static void main(String[] args) {
       /* fizzBuzz(1, 6);
        System.out.println("--------------");
        fizzBuzz(1, 8);
        System.out.println("--------------");
        fizzBuzz(1, 32);*/
        System.out.println(Arrays.toString(fizzBuzz(1, 6)));

    }

    private static String[] fizzBuzz(int min, int max) {
        String[] output = new String[max - min];
        for (int i = 0; i < max - min; i++) {
            if ((i) % 3 == 0 && (i) % 5 == 0) {
                output[i] = "Fizzbuzz";
                // System.out.println("Fizzbuzz");
            } else if ((i) % 3 == 0) {
                output[i] = "Fizz";
                // System.out.println("Fizz");
            } else if ((i) % 5 == 0) {
                output[i] = "Buzz";
                // System.out.println("Buzz");
            } else {
                // System.out.println(i);
                output[i] = String.valueOf(i);
            }
        }

        return output;
    }
}