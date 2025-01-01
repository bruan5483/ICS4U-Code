/**
 *
 * @author Bryant Ruan
 */

//import array essentials
import java.util.Arrays;

public class Main {
    
  /**
   * Takes a 2-dimensional array of integers and determines whether it is a square matrix (i.e. the number of rows is the same as the number of columns).
   *
   * @param matrix
   * @return boolean
   */
  public static boolean isSquareMatrix(int[][] matrix) {
    
    // initalize boolean isSquare for return, set to false for now
    boolean isSquare = false;

    // for loop that goes through each index in the array matrix
    for (int[] row : matrix){
      // checks if the length of each array inside matrix is equal to the length of matrix; isSquare will be true as long as this is satisfied
      if (row.length == matrix.length) {
        isSquare = true;

      // else means than the lengths of a row and the matrix do not match up, meaning that isSquare is false, so we break out of the for loop immediately and return false
      } else {
        isSquare = false;
        break;
      }
    }

    // return boolean isSquare
    return isSquare;
  }
      
  /**
   * @param args the command line arguments
   * @return void
   */
  public static void main(String[] args) {
    /*
     * test cases
     */

    // create a 2D array "test1"
    int[][] test1 = new int[4][3];
    // inititalize the values for each row in the grid
    test1[0] = new int[] {1,2,3};
    test1[1] = new int[] {4,5,6};
    test1[2] = new int[] {6,7,8};
    test1[3] = new int[] {9,10,11};

    // call isSquareMatrix function and print the return
    System.out.println(isSquareMatrix(test1));

    // create a 2D array "test2"
    int[][] test2 = new int[4][4];
    // inititalize the values for each row in the grid
    test2[0] = new int[] {1,2,3,4};
    test2[1] = new int[] {5,6,7,8};
    test2[2] = new int[] {9,10,11,12};
    test2[3] = new int[] {13,14,15,16};

    // call isSquareMatrix function and print the return
    System.out.println(isSquareMatrix(test2));

    // create a 2D array "test3" with different lengths for rows
    int[] row0 = {1, 2, 3};
    int[] row1 = {4, 5};
    int[] row2 = {7, 8, 9};
    int[][] test3 = {row0, row1, row2};

    // call isSquareMatrix function and print the return
    System.out.println(isSquareMatrix(test3));

    // create a 2D array "test4"
    int[] rowX = {1, 2, 3};
    int[] rowY = {4, 5, 6};
    int[] rowZ = {7, 8, 9};
    int[][] test4 = {rowX, rowY, rowZ};

    // call isSquareMatrix function and print the return
    System.out.println(isSquareMatrix(test4));
  }
}
