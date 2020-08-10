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
        System.out.println(Arrays.toString(fizzBuzz(15, 25)));

    }

    private static String[] fizzBuzz(int min, int max) {
        int range = max - min;
        String[] output = new String[range];
        for (int i = 0; i < range; i++) {
            if (min % 3 == 0 && min % 5 == 0) {
                output[i] = "FizzBuzz";
            } else if (min % 3 == 0) {
                output[i] = "Fizz";
            } else if (min % 5 == 0) {
                output[i] = "Buzz";
            } else {
                output[i] = String.valueOf(min);
            }
            min++;
        }
        return output;
    }
}