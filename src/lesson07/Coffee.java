package lesson07;

public class Coffee {
    public static void milk(int ml) {
        System.out.printf("%d of milk \n", ml);
    }

    public static void water(int ml) {
        System.out.printf("%d of water \n", ml);
    }

    public static void coffee(int mg) {
        System.out.printf("%d of water \n", mg);
    }

    public static void latte() {
        milk(40);
        water(100);
        coffee(20);
        System.out.println("latte is ready");
    }

    public static void cappuccino() {
        milk(40);
        water(20);
        coffee(40);
        System.out.println("cappuccino is ready");
    }

    public static void hotWater() {
        milk(0);
        water(100);
        coffee(0);
        System.out.println("hot water is ready");
    }
}
