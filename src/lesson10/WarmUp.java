package lesson10;

public class WarmUp {
    public static void main(String[] args) {
        System.out.println(missingChar("kitten", 1));//expecting "ktten"
        System.out.println(missingChar("kitten", 0));//expecting "itten"
        System.out.println(missingChar("kitten", 4));//expecting "kittn"
        System.out.println(missingChar("Andrey", 2));//expecting "Anrey"
        System.out.println("-------------------------------");
        System.out.println(backAround("cat"));
        System.out.println(backAround("hello"));
        System.out.println(backAround("a"));
        System.out.println("-------------------------------");
        System.out.println(close10(8, 13));
        System.out.println(close10(13, 8));
        System.out.println(close10(7, 13));
        System.out.println("-------------------------------");
        System.out.println(mixStart("mix snacks"));
        System.out.println(mixStart("six snacks"));
        System.out.println(mixStart("piz snacks"));
        System.out.println("-------------------------------");
        /*System.out.println(stringE("Hello"));
        System.out.println(stringE("Heelle"));
        System.out.println(stringE("Hello"));*/
    }

    public static String missingChar(String s, int n) {
        String output = "";
        output = s.substring(0, n) + s.substring(n + 1, s.length() - 1);
        return output;
    }

    public static String backAround(String str) {
        String output = "";
        int lastSymbol = str.length() - 1;
        output = str.substring(lastSymbol);
        return output + str + output;
    }

    public static int close10(int valueOne, int valueTwo) {
        int resultOne;
        int resultTwo;
        resultOne = Math.abs(valueOne - 10);
        resultTwo = Math.abs(valueTwo - 10);
        if (resultOne < resultTwo) {
            return valueOne;
        } else if (resultOne == resultTwo) {
            return 0;
        } else {
            return valueTwo;
        }
    }

    public static boolean mixStart(String str) {
        return str.substring(1, 3).equals("ix");
    }


    /*public static boolean stringE(String s) {
        for (int i = 0; i < s.length(); i++) {
            if(s.contains("e")){

            };
        }else{
            return false;
        }*/
    }




