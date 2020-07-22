package lesson06;

import lesson07.Coffee;

public class HelloSwitch {
    public static void main(String[] args) {

        int value = 31;
        int valueTwo = 32;
        int valueThree = 999;
        coffeeMachine(value);
        System.out.println("------------------");
        coffeeMachine(valueTwo);
        System.out.println("------------------");
        coffeeMachine(valueThree);

    }


    public static void coffeeMachine(int value) {

        switch (value) {
            case 31:
                Coffee.latte();
                break;
            case 32:
                Coffee.cappuccino();
                break;
            case 33:
                Coffee.hotWater();
                break;
            default:
                System.out.println("error, drink is not available");
                break;
        }

    }
}

