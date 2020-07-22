package lesson06;

public class SeasonsHomeWork {
    public static void main(String[] args) {
        int month1 = 1;
        int month2 = 2;
        int month3 = 3;
        int month4 = 4;
        int month5 = 5;
        int month6 = 6;
        int month7 = 7;
        int month8 = 8;
        int month9 = 9;
        int month10 = 10;
        int month11 = 11;
        int month12 = 12;
        int anotherMonth = 99;
        System.out.println("February: " + monthsToSeasons(month2));
        System.out.println(split());
        System.out.println("April: " + monthsToSeasons(month4));
        System.out.println(split());
        System.out.println("June: " + monthsToSeasons(month6));
        System.out.println(split());
        System.out.println("September: " + monthsToSeasons(month9));
        System.out.println(split());
        System.out.println("other input: " + monthsToSeasons(anotherMonth));
    }

    public static String monthsToSeasons(int month1) {
        String result = "";
        switch (month1) {
            case 1:
            case 2:
                result = "winter";
                break;
            case 3:

            case 4:

            case 5:
                result = "spring";
                break;
            case 6:

            case 7:

            case 8:
                result = "summer";
                break;
            case 9:

            case 10:

            case 11:
                result = "fall";
                break;
            case 12:
                result = "winter";
                break;
            default:
                result = "try again";
        }
        return result;
    }

    public static String split() {
        String placeHolder = "------------------------";
        return placeHolder;
    }
}

