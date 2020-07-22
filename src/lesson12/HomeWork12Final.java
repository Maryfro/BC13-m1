package lesson12;

public class HomeWork12Final {
    public static void main(String[] args) {
        homeWork11_5(10);

    }

    public static void homeWork11_5(int line) {
        String star = "*";
        String output = "";
        String space = " ";
        String output2 = "";
        for (int i = 0; i < line; i++) {
            output = output + space;
            output2 = output2 + star;
            //System.out.println(output);
            //System.out.println(output += star);
        }
        String emptyString;
        for (int i = 0; i < line; i++) {
            emptyString = output.substring(0, line);
            //System.out.println(emptyString);
        }

        String veryFinalVariable = "";
        for (int i = 1; i < line; i++) {
            veryFinalVariable = output.substring(0, output.length() - i) + output2.substring(output.length() - i);
            System.out.println(veryFinalVariable);

        }
    }
}




