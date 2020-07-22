package lesson12;

public class Exercise {
    public static void main(String[] args) {
        //rectangle(5,7);
        //FloydsTriangle(7);
        johnDoe();
        //multiplier();

    }

    public static void rectangle(int a, int b) {
        String star = "*";
        String line = "";
        for (int i = 0; i < b; i++) {
            line = line + star;
        }
        System.out.println(line);
        for (int i = 0; i < a; i++) {
            System.out.println(line);

        }
    }

    public static void FloydsTriangle(int n) {
        int number = 1;
        for (int i = 1; i < n; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(number + " ");
                number = number + 1;

            }
            System.out.println();
        }

    }

    public static void johnDoe() {
        int rowOutput = 1;
        for (int x = 1; x < 36; x++) {
            for (int y = x; y < 36; y++) {
                for (int z = y; z <= 36; z++) {
                    if (x * y * z == 36) {
                        System.out.println(rowOutput + ") " + "x = " + x + ", y = " + y + ", z = " + z);
                        rowOutput++;
                    }

                }

            }

        }

    }

    public static void multiplier() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j);
            }
            System.out.println();



        }


    }
}


