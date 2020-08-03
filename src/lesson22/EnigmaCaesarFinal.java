package lesson22;

public class EnigmaCaesarFinal {
    public static void main(String[] args) {
        System.out.println(enigmaCeasarReplace("Съешь же ещё этих мягких французских булок, да выпей чаю."));
    }

    private static String enigmaCeasarReplace(String input) {
        int key = 3;
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.substring(i, i + 1) == " ") {
                input = input + input.substring(i, i + 1);
            } else if (input.substring(i, i + 1) == ".") {
                input = input + input.substring(i, i + 1);
            } else if (input.substring(i, i + 1) == ",") {
                input = input + input.substring(i, i + 1);
            /*} else {
                input = input.replace((char)input.charAt(i), input.charAt(i) + 3));

            }*/
            }
            System.out.println(input);

        }
        return "";
    }
}