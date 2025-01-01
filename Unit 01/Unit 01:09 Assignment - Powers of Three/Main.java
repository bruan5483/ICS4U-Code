/**
 * @author Bryant Ruan
 */

public class Main {
  
  /**
   * Takes two integers, n and m, and prints all the powers of three inclusively between n and m.
   * 
   * @param n any positive integer
   * @param m any integer greater than or equal to n
   * @return String str with all powers of 3 between n and m
   */
  public static String powersOfThree(int n, int m) { 
    //defining string str that will hold the powers of three
    String str = "";
    
    //for loop that checks integers from n to m
    for (int i = n; i <= m; i ++){
      double j = i; //convert integer to double so that there is no rounding during division later on in the program
      if (j%3 != 0) {} //makes program more efficient by eliminating all non-multiples of three (all powers of three are multiples of 3)
      else{
        //loop that will continuously divide double j by 3 until it is less than 1 
        while (j>1){
          j = j/3; 
        }
        //when divided by 3 over and over again, powers of 3 will always end in 1 since 3/3=1; appends the integer i to String str if it is a power of 3
        if (j == 1){
          str += i + " ";
        }
      }
    }
    // return String str that contains all the powers of 3 between n and m
    return str;
  }

  /**
   * 
   * @param args the command line arguments
   * @return void
   */
  public static void main(String[] args) {
    //print all test cases of the function powersOfThree (prints nothing if m>n)
    System.out.println(powersOfThree(1, 300));
    System.out.println(powersOfThree(25, 800));
    System.out.println(powersOfThree(-100, 3));
    System.out.println(powersOfThree(-3, -9));
    System.out.println(powersOfThree(100, 1));
    System.out.println(powersOfThree(2000, 2300));
    System.out.println(powersOfThree(9, 9));
  }
}