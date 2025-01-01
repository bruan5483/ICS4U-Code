/**
 *
 * @author Bryant Ruan
 */

//import arrays
import java.util.Arrays;

public class Main {
    
  /**
   * Takes an array of doubles and returns the second lowest double.
   * 
   * If the array is empty or has only one item, it returns 0.0.
   * 
   * Does not sort the array as a part of its algorithm.
   *
   * @param double[] array
   * @return double secondNum
   */
  public static double secondLowestNum(double[] array) {

    //set up int arrayLength to store the length of the array for later use
    int arrayLength = array.length;

    //set up double sum as an inital value for the lowest numbers 
    double sum = 0;
    //get the sum (has to be done since this program checks for lowest and second lowest at the same time)
    for (double value : array) {
      sum += value;
    }
      
    //set up double lowestNum to be able to store the lowest number as we go through the array (sum is greater than each of the items in the array)
    double lowestNum = sum;
    //set up double secondNum to be able to store the second lowest number as we go through the array (sum is greater than each of the items in the array)
    double secondNum = sum;

    //if the array is empty or has only one item, it returns 0.0
    if (arrayLength < 2){
      return 0.0;
    } else {

      //for loop to read through items in array
      for(int i = 0; i < arrayLength; i++) {
        //if the item at index i in array is lower than the previous lowestNum, it is the new lowestNum
        //set secondNum to the previous lowestNum since it is now the second lowest number
        if (array[i] < lowestNum) {
          secondNum = lowestNum;
          lowestNum = array[i];

        //if the item at index i in array is greater than lowestNum but smaller than secondNum, it is the new second lowest number
        } else if (array[i] < secondNum) {
          secondNum = array[i];
        }
      } 
      
      //return second lowest number
      return secondNum; 
    }
  }
      
  /**
   * @param args the command line arguments
   * @return void
   */
  public static void main(String[] args) {
    /*
     * test cases
     */

    double a[]={1.0, 20.0, 5.0, 6.0, 3.0, 2.0}; 
    double b[]={1.1};
    double c[]={1.1, 222222.0, 14.2, 0.8, 333.6, 0.1};

    System.out.println("Second Lowest: "+ secondLowestNum(a));
    System.out.println("Second Lowest: "+ secondLowestNum(b));
    System.out.println("Second Lowest: "+ secondLowestNum(c));
    
  } 
}