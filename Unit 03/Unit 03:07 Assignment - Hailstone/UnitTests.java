/**
 *
 * @author MissStrong
 */

public class UnitTests {
  /**
   * This method runs the nine tests. 
   *
   * When a test passes, it prints a statement 
   * indicating it passed.
   *
   * When a test does not pass, it prints a statement 
   * indicating that it did not pass.
   */
  public static void runTests() {
    int[] regular_tests = {7, 18, 41, 100001, Integer.MAX_VALUE/3};
    int[] regular_test_solutions = {16, 20, 109, 89, 32};
    int[] overflow_tests = {Integer.MAX_VALUE/3 + 1, Integer.MAX_VALUE/2, Integer.MAX_VALUE - 1, Integer.MAX_VALUE};

    for (int i = 0; i < 5; i++) {
      try {
        if (Main.hailstoneSteps(regular_tests[i]) == regular_test_solutions[i]) {
          System.out.println(String.format("Test %d passed!", i + 1));
        } else {
          System.out.println(String.format("Test %d did NOT pass. ", i + 1));
        }
      } catch (Exception e) {
        System.out.println("Test %d did NOT pass");
      }
    }

    
    for (int i = 0; i < 4; i++) {
      try {
        Main.hailstoneSteps(overflow_tests[i]);
        System.out.println(String.format("Test %d did NOT pass. ", i + 6));
      } catch (IntegerOverflowException e) {
        System.out.println(String.format("Test %d passed!", i + 6));
      } catch (Exception e) {
        System.out.println(String.format("Test %d did NOT pass.", i + 6));
      }
    }
  }
}
