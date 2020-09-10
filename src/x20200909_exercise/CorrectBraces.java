package x20200909_exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class CorrectBraces {
    //given a String with different braces, check if the order of braces is correct. Every next brace can
    // be an opening brace or should close a previous opening brace.

    public static void main(String[] args) {
        System.out.println(checkBraces("[{}([[]])]")); //exp. true
        System.out.println(checkBraces("[{}([}[]])])")); //exp. false

    }

    public static boolean checkBraces(String input) {
        String[] arr = new String[input.length()];
        //String res = "";
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == '[' || input.charAt(i) == '(' || input.charAt(i) == '{') {
                arr[i] = input.substring(i, i + 1);
            } else if (arr[i + 1] == "]" || arr[i + 1] == ")" || arr[i + 1] == "}") {
            }
            // res += input.substring(i, i + 1);
        }
        System.out.println(Arrays.toString(arr));

        return false;
    }

    // Deque<Character> res = new ArrayDeque<Character>();
    // ArrayDeque<Character>
    // res = new Deque<Character> ;

}

