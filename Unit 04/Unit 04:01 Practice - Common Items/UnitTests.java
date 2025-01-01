/**
 *
 * @author MissStrong
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class UnitTests {
  /**
   * This method runs the five tests. 
   *
   * When a test passes, it prints a statement 
   * indicating it passed.
   *
   * When a test does not pass, it prints a statement 
   * indicating that it did not pass.
   */
  public static void runTests() {
    Set<Integer> set1 = new HashSet();
    Set<Integer> set2 = new HashSet(Arrays.asList(1, 2));
    Set<Integer> set3 = new HashSet(Arrays.asList(1, 2, 3));
    Set<Integer> set4 = new HashSet(Arrays.asList(2, 3, 4));
    Set<Integer> set5 = new HashSet(Arrays.asList(3, 4, 5));

    List<HashSet<Integer>> test1 = new ArrayList(Arrays.asList(set1, set1));

    List<HashSet<Integer>> test2 = new ArrayList(Arrays.asList(set2, set3));

    List<HashSet<Integer>> test3 = new ArrayList(Arrays.asList(set3, set4));

    List<HashSet<Integer>> test4 = new ArrayList(Arrays.asList(set2, set5));

    List<HashSet<Integer>> test5 = new ArrayList(Arrays.asList(set1, set5));

    List<ArrayList<HashSet<Integer>>> tests = new ArrayList(Arrays.asList(test1, test2, test3, test4, test5));

    boolean[] solutions = {false, true, true, false, false};

    for (int i = 0; i < 5; i++) {
      try {
        if (Main.haveCommonItems(tests.get(i).get(0), tests.get(i).get(1)) == solutions[i]) {
          System.out.println(String.format("Test %d passed!", i + 1));
        } else {
          System.out.println(String.format("Test %d did NOT pass. ", i + 1));
        }
      } catch (Exception e) {
        System.out.println(String.format("Test %d did NOT pass. ", i + 1));
      }
    }
  }
}
