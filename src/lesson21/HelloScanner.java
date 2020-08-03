package lesson21;

import java.util.Scanner;

public class HelloScanner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("How old are u?");
        age = input.nextInt();
        if(age > 18) System.out.println("you are grown up");
        else System.out.println("you are too little");

        System.out.println("what is your name?");
        String name = input.next();
        System.out.println("Hello " + name);

    }
}
