/**
 *
 * @author Bryant Ruan
 */

//import arrays
import java.util.Arrays;

public class Main {
    
  /**
   * Takes a one-dimensional array of doubles and returns true if 
   * the array is already sorted in either ascending order or 
   * descending order and false otherwise.
   *
   * This method does not sort the array as a part of its 
   * algorithm for efficiency.
   *
   * @param array
   * @return boolean
   */
  public static boolean isSorted(double[] array) {

    //check if length of array is greater than/equal to 2 (so there are no errors)
    if (array.length >= 2){

      //check if the array is supposed to be a decending array
      if (array[0] > array[1]){
        //checks if each item is less than the previous (returns false otherwise)
        for (int i = 0; i < array.length - 1; i++) {
          if (array[i] < array[i + 1]) {
            return false;
          }
        }

      //check if the array is supposed to be an ascending array
      } else if (array[0] < array[1]){
        //checks if each item is greater than the previous (returns false otherwise)
        for (int i = 0; i < array.length - 1; i++) {
          if (array[i] > array[i + 1]) {
            return false;
          }
        }
      }  
    }

    //returns true if the code has passed all the checks (or the length of the array is 0 or 1)
    return true;
  }
      
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    //test1, 1 item in array
    double[] test1 = {0.0};
    System.out.println(isSorted(test1));

    //test2, ascending array
    double[] test2 = {0.0, 7.9, 9.1, 14.3};
    System.out.println(isSorted(test2));

    //test3, decending array
    double[] test3 = {20.9, 13.7, 11.2, 10.0, 6.7, 3.1};
    System.out.println(isSorted(test3));

    //test4, unsorted array
    double[] test4 = {7.7, 1.2, 12.9, 5.6, 10.9};
    System.out.println(isSorted(test4));

    //test5, empty array
    double[] test5 = {};
    System.out.println(isSorted(test5));
  }
}