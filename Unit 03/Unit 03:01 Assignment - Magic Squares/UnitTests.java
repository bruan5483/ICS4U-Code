/*
 *
 * @author MissStrong
 */
import java.util.Arrays;

public class UnitTests {
  
  Main main = new Main();

  // Initializing all tweleve 2D arrays for testing.

  public static int[] array1row1 = {1};

  public static int[] array2row1 = {2, 7, 6};
  public static int[] array2row2 = {9, 5, 1};
  public static int[] array2row3 = {4, 3, 8};

  public static int[] array3row1 = {4, 14, 15, 1};
  public static int[] array3row2 = {9, 7, 6, 12};
  public static int[] array3row3 = {5, 11, 10, 8};
  public static int[] array3row4 = {16, 2, 3, 13};

  public static int[] array4row1 = {9, 6, 3, 16};
  public static int[] array4row2 = {4, 15, 10, 5};
  public static int[] array4row3 = {14, 1, 8, 11};
  public static int[] array4row4 = {7, 12, 13, 2};

  public static int[] array5row1 = {17, 24, 1, 8, 15};
  public static int[] array5row2 = {23, 5, 7, 14, 16};
  public static int[] array5row3 = {4, 6, 13, 20, 22};
  public static int[] array5row4 = {10, 12, 19, 21, 3};
  public static int[] array5row5 = {11, 18, 25, 2, 9};

  public static int[] array6row1 = {6, 32, 3, 34, 35, 1};
  public static int[] array6row2 = {7, 11, 27, 28, 8, 30};
  public static int[] array6row3 = {19, 14, 16, 15, 23, 24};
  public static int[] array6row4 = {18, 20, 22, 21, 17, 13};
  public static int[] array6row5 = {25, 29, 10, 9, 26, 12};
  public static int[] array6row6 = {36, 5, 33, 4, 2, 31};

  public static int[] array7row1 = {0};

  public static int[] array8row1 = {1, 4};
  public static int[] array8row2 = {3, 2};

  public static int[] array9row1 = {1, 1, 1};
  public static int[] array9row2 = array9row1;
  public static int[] array9row3 = array9row1;

  public static int[] array10row1 = {1, 5, 9};
  public static int[] array10row2 = {8, 3, 4};
  public static int[] array10row3 = {6, 7, 2};

  public static int[] array11row1 = {5, 15, 16, 2};
  public static int[] array11row2 = {10, 8, 7, 13};
  public static int[] array11row3 = {6, 12, 11, 9};
  public static int[] array11row4 = {17, 3, 4, 14};

  public static int[] array12row1 = {5, 2, 1};
  public static int[] array12row2 = {3, 6, 7};

  public static int[][] array1 = {array1row1};
  public static int[][] array2 = {array2row1, array2row2, array2row3};
  public static int[][] array3 = {array3row1, array3row2, array3row3, array3row4};
  public static int[][] array4 = {array4row1, array4row2, array4row3, array4row4};
  public static int[][] array5 = {array5row1, array5row2, array5row3, array5row4, array5row5};
  public static int[][] array6 = {array6row1, array6row2, array6row3, array6row4, array6row5, array6row6};

  // Number out of range
  public static int[][] array7 = {array7row1};
  // Columns don't add up correctly
  public static int[][] array8 = {array8row1, array8row2};
  // Duplicate numbers
  public static int[][] array9 = {array9row1, array9row2, array9row3};
  // Diagonals don't add up correctly
  public static int[][] array10 = {array10row1, array10row2, array10row3};
  // Rows don't add up correctly
  public static int[][] array11 = {array11row1, array11row2, array11row3, array11row4};
  // Not a square
  public static int[][] array12 = {array12row1, array12row2};
  
  public static int[][][] magicSquares = {array1, array2, array3, array4, array5, array6};
  public static int[][][] nonMagicSquares = {array7, array8, array9, array10, array11, array12};

  /**
   * This method pretty prints the contents of a 2D array of integers. It adjusts the spacing based on the amount of space each integer takes up.
   *
   * @param matrix
   */
  public static void prettyPrint2DArray(int[][] matrix) {
    // Doesn't print anything if the matrix is empty
    if (matrix.length == 0) return;

    // Negatives take up an extra character
    boolean hasNegatives = false;

    // A number with most digits a cell could have
    int max = matrix[0][0];

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        int cell = matrix[i][j];

        if (cell < 0) hasNegatives = true;

        // If the value with the largest magnitude is negative, Math.abs() will take care of that
        if (Math.abs(cell) > max) max = Math.abs(cell);
      }
    }

    // The most padding (blank spaces) a number could have in front
    String maxPadding = "";

    // Numbers will be signed if there are negative values
    if (hasNegatives) maxPadding = maxPadding + "+";

    // When *max* is only one digit, we are done
    while (max >= 10) {
      maxPadding = maxPadding + "0";

      // Dividing by 10 is equivalent to taking off the last digit since *max* is an integer
      max /= 10;
    }

    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        int cell = matrix[i][j];
        String padding = maxPadding;

        // Negative numbers won't have the "+" in front
        if (cell < 0) padding = padding.substring(1);

        while (Math.abs(cell) >= 10) {
          // Removing one space at a time until the padding is correct
          padding = padding.substring(0, padding.length() - 1);
          // Takes off one digit at a time
          cell /= 10;
        }

        System.out.print(padding + matrix[i][j] + " ");
      }

      // Onto the next row
      System.out.println("");
    }

    // An extra newline at the end for readability
    System.out.println("");
  }

  /**
   * Runs the twelve tests. 
   *
   * When a test passes, it prints a statement indicating it passed.
   *
   * When a test does not pass, it prints a statement indicating that it did not pass.
   */
  public static void runTests() {
    for (int i = 0; i < 6; i++) {
      // These are the cases that should return true
      // A try-catch structure will catch index-out-of-bound errors
      try {
        if (Main.isMagicSquare(magicSquares[i])) {
          System.out.println(String.format("Test %d passed!", i + 1));
        } else {
          System.out.println(String.format("Test %d did NOT pass. ", i + 1));
        }
      } catch (Exception e) {
          System.out.println(String.format("Test %d did NOT pass. ", i + 1));
      }

      prettyPrint2DArray(magicSquares[i]);
    } for (int i = 0; i < 6; i++) {
      // These are the cases that should return false
      try {
        if (!Main.isMagicSquare(nonMagicSquares[i])) {
          System.out.println(String.format("Test %d passed!", i + 7));
        } else {
          System.out.println(String.format("Test %d did NOT pass. ", i + 7));
        } 
      } catch (Exception e) {
        System.out.println(String.format("Test %d did NOT pass. ", i + 7));

      }

      prettyPrint2DArray(nonMagicSquares[i]);
    }
  }
}
