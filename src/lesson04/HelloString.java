package lesson04;

public class HelloString {
    public static void main(String[] args) {
        hiString();
    }

    public static void hiString() {
        String firstName = "Mary";
        String lastName = "Fro";
        char c = '\u00A9';
        int age = 30;
        String person = firstName + '\t' + lastName + '\t'  + age + '\t' + c;
        System.out.println(firstName + " " + lastName + " " + age + " " + c);
        System.out.println (person.length());
        System.out.println (person.substring(0, 10));
        person = person.toUpperCase();
        System.out.println(person);
        person = person.substring(0,1).toUpperCase() + person.substring(1,2).toUpperCase() + person.substring(2,3).toLowerCase() + person.substring(3,4).toUpperCase();
        System.out.println(person);


    }
}

