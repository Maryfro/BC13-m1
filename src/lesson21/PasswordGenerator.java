package lesson21;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        System.out.println(genPass());
    }

    public static String genPass() {
        Scanner input = new Scanner(System.in);
        System.out.println("How long will be you password? Enter the number of symbols");
        int passLength = input.nextInt();
        System.out.println("should your password contain only letters? Answer: true/false");
        boolean answer = input.nextBoolean();
        String pass = "";
        for (int i = 0; i < passLength; i++) {
            if (answer) {
                pass = pass.concat(genAlphabetAndNumeric());
            } else {
                pass = pass + genChar();
            }
        }
        return pass;
    }

    private static String genAlphabetAndNumeric() {
        String input = "12345678900АBFHDSsKHGNMGVFd";
        int myRandom = (int) (Math.random() * (input.length() - 1) + 1);
        char myChar = input.charAt(myRandom);
        return String.valueOf(myChar);
    }

    private static char genChar() {
        int myRandom = (int) (Math.random() * ((90 - 65) + 1) + 65);
        return (char) myRandom;
    }


}
