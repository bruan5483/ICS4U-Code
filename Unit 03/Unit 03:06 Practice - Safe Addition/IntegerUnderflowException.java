/**
 *
 * @author MissStrong
 */

/*
 * This Exception is for when the sum of two integers is less than Integer.MIN_VALUE.
 */
public class IntegerUnderflowException extends Exception { 
  public IntegerUnderflowException() {
    super("Integer Underflow");
  }
}