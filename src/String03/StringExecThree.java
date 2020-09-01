package String03;

public class StringExecThree {
    public static void main(String[] args) {
        sumNumbers("abc123xyz");// → 123
        sumNumbers("aa11b33");// → 44
        sumNumbers("7 11"); //→ 18
        System.out.println(sumNumbersTwo("abc123xyz"));
        System.out.println(sumNumbersTwo("aa11b33"));
        System.out.println(sumNumbersTwo("7 11"));
    }

    private static void sumNumbers(String input) {
        String temp = "";
        String tempTwo = "";
        String left = "";
        String right = "";
        for (int j = input.length() - 1; j >= 0; j--) {
            if (Character.isDigit(input.charAt(j))) {
                temp = input.substring(0, j + 1);
                break;
            }
        }
        for (int i = 0; i < temp.length(); i++) {
            if (Character.isDigit(temp.charAt(i))) {
                tempTwo = temp.substring(i);
                break;
            }
        }
        boolean isParsable = isParsable(tempTwo);
        for (int i = 0; i < tempTwo.length(); i++) {
            if (isParsable) {
                System.out.println(Integer.parseInt(tempTwo));
                break;
            }
            if (!Character.isDigit(tempTwo.charAt(i))) {
                left = tempTwo.substring(0, i);
                right = tempTwo.substring(i + 1);
                System.out.println(Integer.parseInt(left) + Integer.parseInt(right));
            }
        }
    }

    public static boolean isParsable(String str) {
        if (str == null || str.trim().isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }


    private static int sumNumbersOne(String input) {
        int sum = 0;
        int length = input.length();
        int start = -1;
        int end = 0;
        for (int i = 0; i < length; i++) {
            if (start == -1) {
                if (Character.isDigit(input.charAt(i))) {
                    start = i;
                    end = i + 1;
                }
            } else {
                if (Character.isDigit(input.charAt(i))) {
                    end++;
                } else {
                    sum += Integer.parseInt(input.substring(start, end));
                    start = -1;
                }
            }
        }
        if (start != -1) {
            sum += Integer.parseInt(input.substring(start, end));
        }
        return sum;
    }

    private static int sumNumbersTwo(String input) {
        int sum = 0;
        String temp = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                if (i < input.length() - 1 && Character.isDigit(input.charAt(i + 1))) {
                    temp += input.charAt(i);
                } else {
                    temp += input.charAt(i);
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        return sum;
    }
}
