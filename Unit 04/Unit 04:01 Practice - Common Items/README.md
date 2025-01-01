## Instructions

Complete the method `haveCommonItems()` according to its specifications. 

Examples:

* `haveCommonItems({1, 2}, {2, 3})`⇒ `true`
* `haveCommonItems({1, 2, 3}, {1, 3})`⇒ `true`
* `haveCommonItems({1, 2}, {3, 4, 5})`⇒ `false`

To run the five unit tests, remove the `//` near the bottom of `main()`.

**Hint**: The expression `|setA| + |setB| = |setA ∪ setB|` can be read as "The size of setA plus the size of set B is the equal to the size of setA union setB". 

## Main.java

Here is the original code in *Main.java* for reference:

```java
/**
 *
 * @author name
 */

import java.util.HashSet;

public class Main {
    
  /**
   * Takes two hashsets of integers and determines whether 
   * they have any items in common by checking whether 
   * |setA| + |setB| = |setA ∪ setB|.
   * 
   * @param setA
   * @param setB
   * @return true if setA and setB have at least item in common; false otherwise
   */
  public static boolean haveCommonItems(HashSet<Integer> setA, HashSet<Integer> setB) {
    /*
     * Complete this method
     */
     return true;
  }
      
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // UnitTests.runTests();
  }    
}
```
