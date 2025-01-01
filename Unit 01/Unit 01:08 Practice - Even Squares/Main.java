/**
 * @author Bryant Ruan
 */
import java.lang.Math;

public class Main {
  
  /**
   * Takes two integers, n and m, and prints all the even square numbers inclusively between n and m.
   * 
   * @param n any positive integer
   * @param m any integer greater than or equal to n
   * @return str (formatted with text as well as all even perfect squares in one line) 
   */
  public static String evenSquares(int n, int m) {
    /*
     * Create the string "str" with the purpose of formatting the output nicely
     * If the integer m is less than n, return "Error" because the program will not be able to add from n to m
     * Otherwise, check if each of the numbers from n to m are a square root and if they have a remainder of 0 when divided by 2 (making sure they are even)
     * Add the numbers that satisfy the conditions to the end of "str" in the "for" loop
     * Return the final string "str" as an output
     */    
    String str = "Between " + n + " and " + m + ", the even squares are:";
    if (n>m){    
      return "Error";
    } else{ 
      for(int i = n; i <= m; i ++){
        if (Math.sqrt(i)%2==0){
          str += " " + i;
        }
      }
    }
    return str;
  }

  /**
   * 
   * @param args the command line arguments
   * @return void
   */
  public static void main(String[] args) {
    /*
     * Test cases
     */
    System.out.println(evenSquares(1,300));
    System.out.println(evenSquares(3,200));
    System.out.println(evenSquares(100000000,300));
    System.out.println(evenSquares(-10,70));
    System.out.println(evenSquares(3,151));
    }
  }

