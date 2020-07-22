package lesson20;

public class HW20 {
    public static void main(String[] args) {
        cityWeather("Minsk", "Monday");
        cityWeather("Lisbon", "Monday");
        cityWeather("Berlin", "Tuesday");
        cityWeather("Paris", "Sunday");
        cityWeather("Moscow", "Sunday");
        cityWeather("London", "Sunday");
        cityWeather("Saratov", "Sunday");
    }

    public static void cityWeather(String city, String day) {
        int degree = 0;
        switch (city) {
            case "Minsk":
                degree = 18;
                break;
            case "Lisbon":
                degree = 25;
                break;
            case "Berlin":
                degree = 20;
                break;
            case "Paris":
                degree = 23;
                break;
            case "Moscow":
                degree = 19;
                break;
            case "London":
                degree = 17;
                break;
            case "Saratov":
                degree = 15;
                break;
            default:
                System.out.println("invalid degree");
                break;

        }
        int j = 0;
        switch (day) {
            case "Monday":
                j = 1;
                break;
            case "Tuesday":
                j = 2;
                break;
            case "Wednesday":
                j = 3;
                break;
            case "Thursday":
                j = 4;
                break;
            case "Friday":
                j = 5;
                break;
            case "Saturday":
                j = 6;
                break;
            case "Sunday":
                j = 7;
                break;
            default:
                break;
        }
        for (int i = 1; i <= 7; i++) {
            if (i == j) {
                break;
            } else {
                degree = degree + 1;
            }
        }
        System.out.println(degree);
    }
}






