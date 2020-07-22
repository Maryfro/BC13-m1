package lesson06;

public class Calendar<monthDigit> {
    public static void main(String[] args) {
        int monthDigit = 2;
        String monthString = "";

        switch (monthDigit) {
            case 1:
                monthString = "Jan";
                break;
            case 2:
                monthString = "Feb";
                break;
            case 3:
                monthString = "Mar";
                break;
            case 4:
                monthString = "Apr";
                break;
            default:
                monthString = "invalid month" + monthString;
                break;
        }

        System.out.println(monthString);

    }
}
