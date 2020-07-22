package lesson13;

public class HomeWork13_final {
    public static void main(String[] args) {
       /* findNumbers();
        System.out.println("---------------------");*/
//        findPrimeNumbers();
        /*findPrimeNumbers(5);
        findPrimeNumbers(7);*/
       /* System.out.println("----------------------");
        listEvenNumbers(20);
        System.out.println("----------------------");*/
        System.out.println(findLeapYear(1600));
        System.out.println(findLeapYear(2000));
        System.out.println(findLeapYear(1995));
    }

    public static void findNumbers() {
        for (int a = 0; a < 3000; a++) {
            if (a % 32 == 30 && a % 58 == 44) {
                System.out.println(a);
            }
        }

    }

    public static void findPrimeNumbers() {
        //If a number can be divided by anything else but itself (a%i = 0), it is not a prime number
        for (int i = 2; i <= 15; i++) {
            int count = 0;
            for (int j = 2; j <= i; j++) {
                if ((i % j) == 0)
                    count++;
            }
            if (count < 2)
                System.out.println(i);
        }
    }
        /*for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
            } else {
                System.out.println(a);
                break;
                }

            }
        }*/

    public static void listEvenNumbers(int range) {
        for (int i = 0; i < range; i++) {
            if (findEvenNumbers(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean findEvenNumbers(int n) {
        return n % 2 == 0;
    }


    public static boolean findLeapYear(int c) {
        //leap year is a year which is divisible by 400(c%400 = 0), the rest years divisible by 100 are not leap years,
        //except of those which are divisible by 4(leap years)
        if (c % 400 == 0) {
            return true;
        } else if (c % 100 == 0) {
            return false;
        } else if (c % 4 == 0) {
            return true;
        } else return false;
    }
}














