/*
*@author Bryant Ruan
*/

import java.util.Arrays;

class Main {

  /*
   * Bubble sorts a given array
   *
   * @param array of integers
   * @return sorted array
   */
  public static int[] bubbleSort(int[] array){
    
    //for loop that goes through each index in array (not the last index as to prevent an error with the j+1 check) 
    for (int i = 0; i < array.length-1; i++){

      //another for loop that goes through each index in array from 0 to the length of the array minus the value of i and 1 (allows the ints to check how they compared with the other ints)
      for (int j = 0; j < array.length-1-i; j++){

        //if the int at index j is greater than the int at index j+1, swap them through the use of a temp int variable
        if (array[j] > array[j+1]){
          int temp = array[j];
          array[j] = array[j+1];
          array[j+1] = temp;
        }
      }
    }

    //return the sorted array
    return array;
  }

  /**
  *param command line args
  */
  public static void main(String[] args) {
    // Test cases
    int[] array1 = {0};
    int[] array2 = {};
    int[] array3 = {4,4,4,1};
    int[] array4 = {8,7,6,5,4,3,2,1};
    int[] array5 = {6,3,8,1,3,9,0};

    System.out.println("Array 1 unsorted");
    System.out.println(Arrays.toString(array1));
    System.out.println("Array 1 sorted"); 
    System.out.println(Arrays.toString(bubbleSort(array1)));
    
    System.out.println("Array 2 unsorted");
    System.out.println(Arrays.toString(array2));
    System.out.println("Array 2 sorted"); 
    System.out.println(Arrays.toString(bubbleSort(array2)));    

    System.out.println("Array 3 unsorted");
    System.out.println(Arrays.toString(array3));
    System.out.println("Array 3 sorted"); 
    System.out.println(Arrays.toString(bubbleSort(array3)));

    System.out.println("Array 4 unsorted");
    System.out.println(Arrays.toString(array4));
    System.out.println("Array 4 sorted"); 
    System.out.println(Arrays.toString(bubbleSort(array4)));

    System.out.println("Array 5 unsorted");
    System.out.println(Arrays.toString(array5));
    System.out.println("Array 5 sorted"); 
    System.out.println(Arrays.toString(bubbleSort(array5)));
  }
}