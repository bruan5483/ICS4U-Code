/*
@author Bryant Ruan
*/

//import the Scanner class
import java.util.Scanner;

class Main {
  /**
  *Main
  *Takes in integers inputed from the user, gets their sum, and prints it out 

  *@param command line args
  *@return void
  */
  public static void main(String[] args) {    
    //set up int "sum" for calculation of the sum of the user inputs
    int sum = 0;
    //initalize the scanner "sc"
    Scanner sc = new Scanner(System.in);
    //instructions to user for what they should input
    System.out.println("Enter a series of integers. Press 'q' to quit.\n");
    //set up boolean "running" for while loop
    boolean running = true; 
    
    //while loop to continuously ask for inputs while boolean "running" is true
    while (running == true) {
      //the user input is stored in the String "x"
      String x = sc.next();
      //checks if the input is equal to "q" to see if the program should exit the while loop (sets boolean "running" to false)
      if (x.equals ("q")) {
        running = false;
      }
      //checks if the String "x" contains only integer elements. if the "x.matches()" function returns false, it gives an invalid input message
      //idea for "x.matches()" check retrieved from: https://www.delftstack.com/howto/java/how-to-check-if-a-string-is-an-integer-in-java/#check-if-the-string-is-an-integer-by-string-matches-pattern-in-java
      else if (x.matches("-?\\d+") == false) {
        System.out.println("Please enter a valid input");
      } 
      //remaining cases of x can be converted to integers and added to the sum from the previous loop (or 0 in the case of the first loop through)
      else {
        sum += Integer.parseInt(x);
      }
    }

    //print the total (properly formatted)
    System.out.println("\nThe total is " + sum);

    //close the scanner "sc"
    sc.close();
  }
}