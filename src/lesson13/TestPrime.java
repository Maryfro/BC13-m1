package lesson13;

public class TestPrime {
    public static void main(String[] args) {
        primeNumbers();
    }

    public static void primeNumbers() {
        for (int i = 2; i <= 15; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if ((i % j) == 0)
                    count++;
            }
            if (count < 1)
                System.out.println(i);
        }
    }
}
