package lesson26;

public class TriangleDigits {
    public static void main(String[] args) {
         System.out.println(triangleDigitsTwo(6));
        triangleDigitsOne(6);

    }

    public static String triangleDigitsTwo(int countLines) {
        String space = "";
        String rightPart = "";
        String leftPart = "";
        int digit = 0;
        for (int i = 0; i < countLines; i++) {
            space = space + " ";
        }

        for (int j = 1; j <= countLines; j++) {
            digit++;
            space = space.substring(0, space.length() - 1);
            rightPart = rightPart + digit;
            leftPart = digit + leftPart;
            String resultTwo = space + leftPart + rightPart;
            System.out.println(resultTwo);
        }
        return space;
    }


    private static void triangleDigitsOne(int countLines) {

        int digit = 0;
        String temp = "";
        for (int i = 1; i <= countLines; i++) {
            digit++;
            if (digit == 1) System.out.print("     " + digit);
            else if (digit == 2) temp = "    " + digit +  digit + digit;
            else if (digit == 3) temp = "   " + digit + digit + digit + digit + digit;
            else if (digit == 4) temp = "  " + digit +  digit + digit + digit + digit + digit + digit;
            else if (digit == 5)
                temp = " " + digit  + digit + digit + digit + digit + digit + digit + digit + digit;
            else
                temp = digit + "" + digit + digit + digit + digit + digit + digit + digit + digit + digit + digit;
            System.out.println(temp);
        }


    }
}






    /*    int digit = 1;
        String temp = "";
        String result = "";
        if (countLines == 0) {
            return 1;
        }else if (countLines > 0 ){
            System.out.print(digit);
            triangleDigitsOne(countLines - 1);
            digit = countLines + 1 - digit;
            temp = digit + "" + countLines;
        }
        System.out.println(temp);
        return 0;*/


   /* printStar(int x)
    {
        if(x > 0)
        {
            System.out.print("*");
            printStar(x-1);*/










