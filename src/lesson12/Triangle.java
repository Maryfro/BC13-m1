package lesson12;

public class Triangle {
    public static void main(String[] args) {
//triangle("*", 10);
        //triangleTwo("*", 10);
        //triangleThree("*", 10);
        pyramid("*", 10);
        System.out.println("----------------------------------");
        reversedPyramid("*", 10);
    }

    public static String triangle(String divider, int countLines) {
        String line = "";
        for (int i = 0; i < countLines; i++) {
            line += divider;
            System.out.println(line);

        }
        return line;
    }

    public static void triangleTwo(String divider, int countLines) {
        String line = "";
        for (int i = 0; i < countLines; i++) {
            line += divider;
        }
        for (int i = 0; i < countLines; i++) {
            line = line.substring(0, line.length() - 1);
            System.out.println(line);
        }
    }

    public static String triangleThree(String divider, int countLines) {
        String lineSpace = "";
        String lineStar = "";

        for (int i = 0; i < countLines; i++) {
            lineSpace = lineSpace + " ";
        }

        for (int i = 0; i < countLines; i++) {
            lineSpace = lineSpace.substring(0, lineSpace.length() - 1);
            //line = line.substring(line.length() - 1);
            lineStar = lineStar + divider;
            String result = lineSpace + lineStar;
            System.out.println(result);
        }

        return lineSpace;
    }

    public static String pyramid(String divider, int countLines) {
        String lineSpace = "";
        String lineStar = "";
        String starMirror = "";

        for (int i = 0; i < countLines; i++) {
            lineSpace = lineSpace + " ";
        }

        for (int i = 0; i < countLines; i++) {
            lineSpace = lineSpace.substring(0, lineSpace.length() - 1);
            lineStar = lineStar + divider;
            starMirror = starMirror + "*";
            String result = lineSpace + lineStar + starMirror;
            System.out.println(result);
        }
        return lineSpace;

    }

    public static void reversedPyramid(String divider, int countLines) {
        String lineStar = "";
        String lineSpace = "";
        String space = " ";
        String one = "";
        for (int i = 0; i < countLines; i++) {
            lineStar = lineStar + divider;
            for (int j = 0; j < countLines; j++) {
            }
        }
        for (int i = 0; i <= countLines; i++) {
            lineSpace = lineSpace + space;
            String s = lineStar.substring(0, lineStar.length() - i);
            one = lineSpace.substring(lineSpace.length() - i) + s + s + lineSpace.substring(1);
            System.out.println(one);
        }

    }
}




