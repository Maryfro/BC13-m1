package lesson20;

public class HW20 {
    public static void main(String[] args) {
     /*   cityWeather("Minsk", "Friday");
        cityWeather("Lisbon", "Sunday");
        cityWeather("Berlin", "Sunday");
        cityWeather("Paris", "Sunday");
        cityWeather("Moscow", "Sunday");
        cityWeather("London", "Sunday");
        cityWeather("Saratov", "Sunday");
*/
        cityWeather("Lisbon");
        cityWeather("Paris");
        cityWeather("Moscow");
        cityWeather("Minsk");

    }

    public static void cityWeather(String city) {
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
        for (int i = 0; i < 7; i++) {
            degree = degree + 1;
        }
        System.out.println(degree);

    }

   /* public static void checkWeather(String city, String day) {
        cityWeather();
        int degree = 0;
        for (int i = 0; i < 7; i++) {
            cityWeather() = cityWeather() + 1;
            System.out.println(degree);*/
}






