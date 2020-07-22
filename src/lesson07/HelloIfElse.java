package lesson07;

public class HelloIfElse {
    public static void main(String[] args) {
        ageAlcoholIf(15);
        boolean permission = true;
        if (permission = true) {
            System.out.println("go");
        } else {
            System.out.println("no go");
        }
    }

    public static void ageAlcoholIf(int age) {
        if (age < 16) {
            System.out.println("no");
        }else if (age < 18) {
                System.out.println("beer");
        } else {
            System.out.println("yes");
        }
    }
}

