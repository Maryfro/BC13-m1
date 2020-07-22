package lesson03;

public class MagicDouble {
    public static void main(String[] args) {
        int min = 1;
        int max = 100;
        int magic = (int) ((Math.random() * (max - min) + 1)) + min;
        int magic1 = (int) ((Math.random() * (max - min) + 1)) + min;
        int magic2 = (int) ((Math.random() * (max - min) + 1)) + min;
        int magic3 = (int) ((Math.random() * (max - min) + 1)) + min;
        System.out.println(magic);
        System.out.println(magic1);
        System.out.println(magic2);
        System.out.println(magic3);
    }
}
