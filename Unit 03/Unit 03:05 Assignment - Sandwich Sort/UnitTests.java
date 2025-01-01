/*
 *
 * @author MissStrong
 */
import java.util.Arrays;
import java.util.Random;

public class UnitTests {

  // Initializing all 10 arrays for testing.
  public static int[] array1 = {};
  public static int[] array2 = {1, 2, 3};
  public static int[] array3 = {3, 2, 1};
  public static int[] array4 = {3, 2, 4, 1};
  public static int[] array5 = {3, 6, 2, 8, 1, -1, 6, 1};
  public static int[] array6 = new int[10];
  public static int[] array7 = new int[15];
  public static int[] array8 = new int[20];
  public static int[] array9 = new int[25];
  public static int[] array10 = new int[100];

  /*
   * A 2D array of all the test arrays so that it's
   * easier to go through them one by one.
   */
  public static int[][] allArrays = {array1, array2, array3, array4, array5, array6, array7, array8, array9, array10};
  
  /**
   * This method generates a random integer.
   *
   * @return a randomly generated integer
   */
  public static int generateRandomInteger() {
    Random random = new Random();
    return random.nextInt();
  }

  /**
   * This method fills in the values of the five
   * randomly generated arrays for testing.
   */
  public static void fillRandomArrays() {
    int[][] randomArrays = {array6, array7, array8, array9, array10};

    for (int i = 0; i < 5 ; i++) {
      int[] array = randomArrays[i];

      for (int j = 0; j < array.length; j++) {
        randomArrays[i][j] = generateRandomInteger();
      }
    }
  }

  /*
   * This method copies the contents of an array into
   * a new array.
   *
   * @param array
   * @return the copy of the array
   */
  public static int[] copyArray(int[] array) {
    int[] arrayCopy = new int[array.length];

    for (int i = 0; i < array.length; i++) {
      arrayCopy[i] = array[i];
    }

    return arrayCopy;
  }

  /**
   * This method runs the ten tests. 
   * When a test passes, it prints a statement 
   * indicating it passed.
   * When a test does not pass, it prints a statement 
   * indicating that it did not pass.
   */
  public static void runTests() {
    fillRandomArrays();

    for (int i = 0; i < 10; i++) {
      int[] sandwichArray = allArrays[i];
      int[] sortedArray = copyArray(sandwichArray);
      Arrays.sort(sortedArray);
      Main.sandwichSort(sandwichArray);

      if (Arrays.toString(sandwichArray).equals(Arrays.toString(sortedArray))) {
        System.out.println(String.format("Test %d passed!", i + 1));
      } else {
        System.out.println(String.format("Test %d did NOT pass.", i + 1));
      }
    }
  }
}
