package lesson06;

public class SwitchHomeWork {
    public static void main(String[] args) {
        int age = 10;
        int ageTwo = 17;
        int ageThree = 18;
        int ageFour = 20;
        int ageFive = 30;
        int ageSix = 99;
        System.out.println("age 10: " + AgeAlcohol(age));
        System.out.println(split());
        System.out.println("age 17: " + AgeAlcohol(ageTwo));
        System.out.println(split());
        System.out.println("age 18: " + AgeAlcohol(ageThree));
        System.out.println(split());
        System.out.println("age 20: " + AgeAlcohol(ageFour));
        System.out.println(split());
        System.out.println("age 20: " + AgeAlcohol(ageFive));
        System.out.println(split());
        System.out.println("other age: " + AgeAlcohol(ageSix));

    }

    public static String AgeAlcohol(int age) {
        String result = "";
        switch (age) {
            case 10:
            case 17:
                result = "don't sell alcohol";
                break;
            case 18:
            case 20:
            case 30:
                result = "sell alcohol";
                break;
            default:
                result = "ask age again";

        }
        return result;

    }

    public static String split() {
        String placeHolder = "------------------------";
        return placeHolder;

    }
}

