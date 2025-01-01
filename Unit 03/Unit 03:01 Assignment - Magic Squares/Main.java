/**
 *
 * @author Bryant Ruan
 */

//import Array essentials
import java.util.Arrays;

public class Main {

  /**
   * Takes a 2-dimensional array of integers and determines whether it is a square matrix (i.e. the number of rows is the same as the number of columns).
   * Taken from my solution for Practice 8: Square Matrix
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
   * Takes a 2-dimensional array of integers and determines whether it is a magic square.
   *
   * @param matrix
   * @return boolean
   */
  public static boolean isMagicSquare(int[][] matrix) {    
    //check if the matrix is a square
    if (isSquareMatrix(matrix)==true){
      
      //side length of the square matrix
      int n = matrix.length;
      
      //to hold the total (theoretical) sum of a square array of side length n
      int sum = 0;

      //gets the sum of all numbers from 1 to n^2
      for (int i = 1; i<=(n*n); i++){
        sum+=i;
      }

      //what the sum of each row/column/diagonal should be
      int average = sum/n;
      
      //go through each row in the matrix
      for (int[] row : matrix){
        //set up int rowSum for each row
        int rowSum = 0;

        //calculate row sums
        for (int i : row){
          rowSum += i;
        }
        //if the sum of the row is not equal to what it should be, return false
        if (rowSum != average){
          return false;
        }
      }

      //going through columns in matrix
      for (int i = 0; i < n; i++){
        //set up int columnSum for each column
        int columnSum = 0;

        //calculate the sum of each column
        for (int j = 0; j < n; j++){
          columnSum += matrix[j][i];
        }
        //if the sum of the column is not equal to what it should be, return false
        if (columnSum != average){
          return false;
        }
      }

      //set up ints to hold sums of diagonals
      int diagonalSum1 = 0,diagonalSum2=0;

      //go through each index in matrix
      for (int i = 0; i < n; i++){
        //diagonal from top left to bottom right
        diagonalSum1 += matrix[i][i];
        //diagonal from left right to bottom left
        diagonalSum2 += matrix[i][n-1-i];
      }

      //if the sum of either diagonal is not equal to what it should be, return false
      if (diagonalSum1!=average || diagonalSum2!=average){
        return false;
      }
        
      //if the matrix has passed all tests, then it is a magic square
      return true;

    //returns false if matrix is not a square
    } else {
      return false;
    }
  }
      
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    /*
     * Runs the twelve pre-made tests.
     *
     */
    UnitTests.runTests();
  }   
}