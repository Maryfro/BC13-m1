package lesson09;

public class HelloAbs {
    public static void main(String[] args) {
        System.out.println(nearHundred(93));
        System.out.println(nearHundred(89));
        System.out.println(nearHundred(90));
    }

    public static boolean nearHundred(int digit) {
        int range = 10;
        return (Math.abs(digit - 100) <= range || Math.abs(digit - 200) <= range);
    }

}
