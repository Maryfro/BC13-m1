package lesson04;

public class HelloChar {
    public static void main(String[] args) {
        hiChar();
    }
        public static void hiChar(){
            char c = 3000;
            System.out.println(c);
            System.out.println('\u0123');
            char euro = '€';
            System.out.println(euro);
            char tab = '\t';
            System.out.println("" + euro + tab + c);

        }
    }

