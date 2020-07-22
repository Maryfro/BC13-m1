package lesson11;

public class TalkingParrot {
    public static void main(String[] args) {
        System.out.println(parrotTrouble(true, 6)); // true
        System.out.println(parrotTrouble(true, 7)); // false
        System.out.println(parrotTrouble(false, 6)); // false
    }

    public static boolean parrotTrouble(boolean parrot, int hour) {
        if (hour > 0 && hour < 7 || hour > 20 && hour < 23) {
            return parrot;
        } else {
            return !parrot;
        }
    }
}

