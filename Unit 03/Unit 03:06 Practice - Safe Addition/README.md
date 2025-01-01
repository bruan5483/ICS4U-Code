## Instructions

Complete the program so that the method `safeAdd()` takes two integers returns their sum unless there is integer overflow or underflow. If integer overflow occurs, it throws a `IntegerOverflowException`; and if integer underflow occurs, it throws a `IntegerUnderflowException`. These are both custom exceptions in this program (see the other two Java files).

**Hint 1**: Consider using separate cases based on when `x` and `y` are positive or negative.

**Hint 2**: Consider subtracting from `Integer.MAX_VALUE` to detect overflow and adding to `Integer.MIN_VALUE` to detect underflow.

## Main.java

Here is the original code in *Main.java* for reference:

```java
/**
 *
 * @author name
 */

public class Main {
    
  /**
   * Adds x and y, unless overflow or underflow occurs in which case
   * it throws an Overflow or Underflow exception.
   *
   * @throws IntegerOverflowException, IntegerUnderflowException
   * @param array
   * @return boolean
   */
  public static int safeAdd(int x, int y) throws IntegerOverflowException, IntegerUnderflowException {
    /*
     * Complete this method so that it throws the custom 
     * IntegerOverflowException or IntegerUnderflowException 
     * if the sum overflows or underflows.
     */
    return x + y;
  }
      
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
     try {
      /*
       * Write your own tests here.
       */
       System.out.println(safeAdd(1, Integer.MAX_VALUE)); // This should overflow
       System.out.println(safeAdd(-1, Integer.MIN_VALUE)); // This should underflow
     } catch (IntegerOverflowException e) {
       System.out.println(e);
     } catch (IntegerUnderflowException e) {
       System.out.println(e);
     }
  }
}
```
