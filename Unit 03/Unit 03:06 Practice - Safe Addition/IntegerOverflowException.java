/**
 *
 * @author MissStrong
 */

/*
 * This Exception is for when the sum of two integers is greater than Integer.MAX_VALUE.
 */
public class IntegerOverflowException extends Exception { 
  public IntegerOverflowException() {
    super("Integer Overflow");
  }
}