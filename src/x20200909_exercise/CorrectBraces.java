package x20200909_exercise;

import java.util.ArrayDeque;

public class CorrectBraces {
    //given a String with different braces, check if the order of braces is correct. Every next brace can
    // be an opening brace or should close a previous opening brace.

    public static void main(String[] args) {
        System.out.println(checkBraces("[{}([[]])]")); //exp. true
        System.out.println(checkBraces("[{}([}[]])])")); //exp. false
        System.out.println(checkBraces("[[[]]]")); //exp. true
        System.out.println(checkBraces("[[[]}]")); //exp. false
    }

    public static boolean checkBraces(String input) {
        ArrayDeque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '[' || input.charAt(i) == '(' || input.charAt(i) == '{') {
                deque.add(input.charAt(i));
            } else if (input.charAt(i) == ']') {
                if (deque.contains('[')) {
                    deque.remove('[');
                }else{
                    deque.add(']');
                }
            } else if (input.charAt(i) == ')') {
                if (deque.contains('(')) {
                    deque.remove('(');
                }else{
                    deque.add(')');
                }
            } else if (input.charAt(i) == '}') {
                if (deque.contains('{')) {
                    deque.remove('{');
                }else {
                    deque.add('}');
                }
            }
        }
        return deque.isEmpty();
    }
}

