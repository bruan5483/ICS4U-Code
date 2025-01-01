## Instructions

Complete the `hailstoneSteps()` method according to its specifications. The hailstone problem is explained here: https://www.youtube.com/watch?v=5mFpVDpKX70

Be sure to use a **recursive approach** and **detect integer overflow**.

To run the nine unit tests, remove the `//` near the bottom of `main()`.

## Main.java

Here is the original code in *Main.java* for reference:

```java
/**
 * @author name
 */

public class Main {
  /**
   * Takes a positive integer and uses a recursive approach to 
   * calculate the number of steps it would takes this integer to 
   * reach 1 using the algorithm provided in the video below:
   * https://www.youtube.com/watch?v=5mFpVDpKX70
   *
   * If at any point there is integer overflow,
   * the method throws an IntegerOverflowException.
   * 
   * @throws IntegerOverflowException
   * @param n an integer
   * @return the number of steps to reach 1
   */
  public static int hailstoneSteps(int n) throws IntegerOverflowException {
    /*
     * Complete this method using recursion
     */
     return 0;
  }

  /**
   *
   * @param args the command line arguments
   * @return void
   */
  public static void main(String[] args) {
    try {
      //UnitTests.runTests();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}

```
