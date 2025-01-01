/**
 *
 * @author Bryant Ruan
 */
 
import java.util.Arrays;

public class Main {

  /*
   * Swaps two integers (at indices a and b) in an int array
   *
   * @param array of integers
   * @param int a 
   * @param int b
   * @return swapped array
   */
  public static int[] swap(int[] array, int a, int b){

    //create temp int variable to store value at index a
    int temp = array[a];
    //change the value of the item at index a to that of index b
    array[a] = array[b];
    //change the value of the item at index b to that of the temp int variable (old value of the item at index a)
    array[b] = temp;

    //return the swapped array
    return array;
  }
  
  /**
   * Uses the Sandwich Sort algorithm to sort 
   * a list of integers in numerical order 
   * from least to greatest.
   *
   * The Sandwhich Sort algorithm is demonstrated 
   * in the video below:
   * https://drive.google.com/file/d/1DkXcFB81hnptv6Dk_ie5L0Fmdn4WGmSe/view?usp=sharing
   * 
   * @param array the array of integers
  */
  public static void sandwichSort(int[] array) {  

    //if the length of the int array is 0 or 1, it is already sorted (if statement prevents index errors)
    if (array.length > 1){

      //set up int firstIndex to be the lower bind on the items in the array that will be checked
      int firstIndex = 0;
      //set up int lastIndex to be the upper bind on the items in that array that will be checked
      int lastIndex = array.length-1;

      //while loop that continuously loops until firstIndex is greater than/equal to lastIndex
      while (lastIndex > firstIndex){

        //set up int min to hold the lowest number each time we loop through the while loop; starts as the first item in the unsorted part of the array
        int min = array[firstIndex];
        //set up int max to hold the highest number each time we loop through the while loop; starts as the first item in the unsorted part of the array
        int max = array[firstIndex];
        //holds the index of the lowest number; starts with the index of the first item that is unsorted
        int minIndex = firstIndex;
        //holds the index of the higest number; starts with the index of the first item that is unsorted
        int maxIndex = firstIndex;

        //for loop that goes from firstIndex to lastIndex of the unsorted part of the array
        for (int i = firstIndex; i <= lastIndex; i++){

          //if the item at index i is less than the previous lowest number, it is the new lowest number
          if (array[i] <= min){
            //set min equal to new min
            min = array[i];
            //set minIndex equal to index of new min
            minIndex = i;

          //if the item at index i is greater than the previous highest number, it is the new highest number
          } else if (array[i] >= max){
            //set max equal to new max
            max = array[i];
            //set maxIndex equal to index of new max
            maxIndex = i;
          }
        }

        //swap the items at firstIndex and minIndex so that the lowest number is now at the beginning of the unsorted part of the array
        swap(array, firstIndex, minIndex);

        //if max was intially at the postion of firstIndex and was moved in the previous swap, we have to account for that in this if statement
        if (array[minIndex] == max){
          swap(array, lastIndex, minIndex);

        //otherwise, the positions of lastIndex and maxIndex can just be swapped
        } else {
          swap(array, lastIndex, maxIndex);
        }

        //increase the lower bind firstIndex by 1
        firstIndex++;
        //decrease the upper bind lastIndex by 1
        lastIndex--; 
      }
    }
  }
  
  /**
   * 
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    //run the tests
    UnitTests.runTests();
  }
}