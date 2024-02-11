import java.util.*;

public class NumberPyramid {
    public static void main(String[] args) {
        int rows = 5; // Change the value of rows to adjust the size of the pyramid
        printNumberPyramid(rows);
    }

    public static void printNumberPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            // Printing spaces
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }

            // Printing numbers in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Printing numbers in decreasing order
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
