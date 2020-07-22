package lesson07;

public class IfElseHomeWork {
    public static void main(String[] args) {
        speedFines(50);
        speedFines(66);
        speedFines(101);
        speedFines(131);
        System.out.println("-------------------------");
        waysOfViking(1);
        waysOfViking(2);
        waysOfViking(3);
        waysOfViking(0);
    }

    public static void speedFines(int speed) {
        if (speed <= 50) {
            System.out.println("all right");
        } else if (speed <= 65) {
            System.out.println("oral warning");
        } else if (speed <= 100) {
            System.out.println("40€ fine");
        } else if (speed <= 130) {
            System.out.println("500€ fine");
        } else {
            System.out.println("1000€ fine, no driving licence, no car");
        }
    }

    public static void waysOfViking(int way) {
        if (way == 1) {
            System.out.println("go to the left and loose your horse");
        } else if (way == 2) {
            System.out.println("go to the right and die");
        } else if (way == 3) {
            System.out.println("go straight and be happy");
        } else {
            System.out.println("ask again");
        }
    }
}