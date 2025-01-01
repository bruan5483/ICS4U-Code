## Instructions

Implement the bubble sort algorithm as specified. 

Bubble Sort

Let the index be 0

Do the following until the array is sorted:

    Do the following until the index+1 is beyond the length of the array:

        If the element at the index is greater than the one after it:

            Swap them

        Increase the index by 1
        

The idea is that you have a bubble around two elements at a time. The bubble starts at the first two elements. If the elements in the bubble are not in order, they are swapped. The bubble then moves on to the second two elements. Again, it swaps the elements if they are not in order. It repeats this process until it reaches the end, then it goes back to the beginning and repeats the entire process over and over again until the entire array is sorted.

Here's the original code in main.java for reference

## Main.java

```java

/*
*@author name
*/

import java.util.Arrays;

class Main {


  public static int[] bubbleSort(int[] array){
    /*
    * What goes here?
    */
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