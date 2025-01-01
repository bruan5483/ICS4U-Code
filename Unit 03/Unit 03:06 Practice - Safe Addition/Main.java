/**
 *
 * @author Bryant Ruan
 */

public class Main {
    
  /**
   * Adds x and y, unless overflow or underflow occurs in which case
   * it throws an Overflow or Underflow exception.
   *
   * @throws IntegerOverflowException, IntegerUnderflowException
   * @param array
   * @return int
   */
  public static int safeAdd(int x, int y) throws IntegerOverflowException, IntegerUnderflowException {

    //if x and y are both greater than 0 and x is greater than y subtracted from the max value, throw IntegerOverflowException
    if (x > 0 && y > 0 && x > (Integer.MAX_VALUE - y)){
      throw new IntegerOverflowException();

    //else if x and y are both less than 0 and x is less than y added to the max value, throw IntegerOverflowException
    } else if (x < 0 && y < 0 && x < (Integer.MIN_VALUE + y)) {
      throw new IntegerUnderflowException();
    }

    //return x+y if x and y pass the overflow/underflow checks
    return x+y;
  }
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    //test cases
    try {
      System.out.println(safeAdd(1, Integer.MAX_VALUE)); // This should overflow
    } catch (IntegerOverflowException e) {
      System.out.println(e);
    } catch (IntegerUnderflowException e) {
      System.out.println(e);
    }

    try {
      System.out.println(safeAdd(-1, Integer.MIN_VALUE)); // This should underflow
    } catch (IntegerOverflowException e) {
      System.out.println(e);
    } catch (IntegerUnderflowException e) {
      System.out.println(e);
    }

    try {
      System.out.println(safeAdd(500, 100000)); // Should return 100500 
    } catch (IntegerOverflowException e) {
      System.out.println(e);
    } catch (IntegerUnderflowException e) {
      System.out.println(e);
    }

    try {
      System.out.println(safeAdd(Integer.MIN_VALUE+1, -2)); // This should underflow
    } catch (IntegerOverflowException e) {
      System.out.println(e);
    } catch (IntegerUnderflowException e) {
      System.out.println(e);
    }

    try {
      System.out.println(safeAdd(Integer.MAX_VALUE-1, 2)); // This should overflow
    } catch (IntegerOverflowException e) {
      System.out.println(e);
    } catch (IntegerUnderflowException e) {
      System.out.println(e);
    }
    
  }
}
