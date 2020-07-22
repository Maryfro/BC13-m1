package lesson04;

public class StringHomeWork {
    public static void main(String[] args) {
        funnyCharacters();
        nameOccupation();
        personalData();
        stringIndexing();

    }

    public static void funnyCharacters() {
        char bitcoin = '\u20BF';
        char smiley = '\u263A';
        char blackSmiley = '\u263B';
        System.out.println(bitcoin + " " + smiley + " " + blackSmiley);
    }

    public static void nameOccupation() {
        String name = "Mary";
        String occupation = "Java developer";
        System.out.println(name + " " + '\"' + occupation + '\"');
    }

    public static void personalData() {
        String userName = "Mary";
        String lastName = "Fro";
        String address = " Berlin Prenzlauer Berg";
        System.out.println("- user name: " + userName);
        System.out.println("- last name: " + lastName);
        System.out.println("- address: " + address);
    }

    public static void stringIndexing() {
        String stringOne = "Вход разрешен";
        stringOne = stringOne.substring(0, stringOne.length() - 8);
        System.out.println(stringOne);
        String stringTwo = stringOne + " воспрещен";
        System.out.println(stringTwo);
        stringTwo = stringTwo.toUpperCase();
        System.out.println("ОСТОРОЖНО, " + stringTwo);
    }
} 

