package lesson07;

public class HelloModulo {
    public static void main(String[] args) {

        for (int a = 0; a < 3000; a++) {
            if (a % 32 == 30 && a % 58 == 44) {
                System.out.println(a);

            }
        }
    }
}

