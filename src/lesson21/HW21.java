package lesson21;

import java.util.Scanner;

public class HW21 {
    public static void main(String[] args) {
        findNumber();

    }

    public static void findNumber() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("выбрать минимальное число");
        int userMin = userInput.nextInt();
        System.out.println("выбрать максимальное число");
        int userMax = userInput.nextInt();
        System.out.println("выбрать количество попыток");
        int k = userInput.nextInt();
        int number = (int) (Math.random() * ((userMax - userMin) + 1)) + userMin;
        // System.out.println(number);
        int count = 0;
        for (int i = 1; i <= k; i++) {
            System.out.println(i + " попытка");
            int userNumber = userInput.nextInt();
            if (number == userNumber) {
                System.out.println("Вы угадали! УРА!");
                count = 1;
                break;
            } else if (number < userNumber) {
                System.out.println("Не угадали. Загаданное число меньше");
            } else {
                System.out.println("Не угадали. Загаданное число больше");
            }
        }
        if (count != 1) {
            System.out.println("Попытки закончились");
        }
    }
}


