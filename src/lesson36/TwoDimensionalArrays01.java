package lesson36;

public class TwoDimensionalArrays01 {
    public static void main(String[] args) {
        int[][] array = new int[5][6];
        createArray(array);
        printOneLine(array);
        System.out.println("------------------------");
        PifagorTable.printTwoDimensionalArray(array);
    }

    private static void printOneLine(int[][] input) {
        for (int i = 0; i < input[2].length; i++) {
            System.out.print(input[2][i] + " ");
        }
        System.out.println();
    }

    private static int[][] createArray(int[][] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                myArray[i][j] = (int) (Math.random() * 100);
            }
        }
        return myArray;
    }
}
