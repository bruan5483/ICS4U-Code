/**
 * @author Bryant Ruan
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

    //if n is an odd number && is greater than the value of Integer.MAX_VALUE after reversing the 3n+1 operation, throw a new IntegerOverflowException
    if (n % 2 != 0 && n > (Integer.MAX_VALUE-1)/3) throw new IntegerOverflowException();

    //if n equals 1, return 0 and end recursion
    if (n == 1) return 0;

    //if n is even, return 1+call the function for the number after it is divided by 2
    if (n % 2 == 0) return 1 + hailstoneSteps(n/2);

    //else (n is odd), return 1+call the function for the number after it goes through the process of 3n+1
    else return 1 + hailstoneSteps((3 * n) + 1);

  }

  /**
   *
   * @param args the command line arguments
   * @return void
   */
  public static void main(String[] args) {
    //exception handling
    try {
      //test cases
      UnitTests.runTests();

    //exception handling
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
