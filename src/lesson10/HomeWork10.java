package lesson10;

public class HomeWork10 {
    public static void main(String[] args) {
        System.out.println(startHi("hi there"));
        System.out.println(startHi("hi"));
        System.out.println(startHi("Hello hi"));
        System.out.println("-----------------------");
        System.out.println(hasTeen(13, 20, 10));
        System.out.println(hasTeen(20, 19, 10));
        System.out.println(hasTeen(20, 12, 100));
    }

    public static boolean startHi(String input) {
        /*if (input.startsWith("hi")) {
            return true;
        } else {
            return false;
        }
    }*/
        return input.substring(0,2).equals("hi");
    }



    public static boolean hasTeen(int valueOne, int valueTwo, int valueThree) {
        return valueOne >= 13 && valueOne <= 19 || valueTwo >= 13 && valueTwo <= 19
                || valueThree >= 13 && valueThree <= 19;
    }
}





