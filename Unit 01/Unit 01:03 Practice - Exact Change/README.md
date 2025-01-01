## Instructions

The given program generates a random number of each of the six Canadian coins. Your task is to complete the program so that it also calculates the total number of coins and the total value of these coins. 

You will be filling in the body of the methods `totalNumber()` and `totalValue()`. Do not modify the documentation.

Your program should output something like this (the numbers will vary):

```
Number of pennies: 2
Number of nickels: 9
Number of dimes: 0
Number of quarters: 6
Number of loonies: 1
Number of toonies: 4
Total number of coins: 22
Total value of coins: $10.97
```

The total value should have exactly two decimal places. For example `$13` and `$20.6` are incorrectly written (they should be `$13.00` and `$20.60`).

## Main.java

Here is the original code in *Main.java* for reference:

```java
/**
 * @author name
 */

public class Main {

  /*
   * Generates random integers between 0 and 10 for each of these variables. 
   */
  public static int numPennies = (int)(Math.random() * 11);
  public static int numNickels = (int)(Math.random() * 11);
  public static int numDimes = (int)(Math.random() * 11);
  public static int numQuarters = (int)(Math.random() * 11);
  public static int numLoonies = (int)(Math.random() * 11);
  public static int numToonies = (int)(Math.random() * 11);
  
   /**
   * Calculates the total number of coins.
   *
   * @return int
   */
  public static int totalNumber() {
    /*
     * What goes here?
     */
    return 0;
  }
  
   /**
   * Calculates the amount of money the coins add up to.
   *
   * @return double
   */
  public static double totalValue() {
    /*
     * What goes here?
     */
    return 0.0;
  }

  /**
   * Calculates the total number of coins and the 
   * amount of money the coins add up to.
   *
   * @param args the command line arguments
   * @return void
   */
  public static void main(String[] args) {
    System.out.println("Number of pennies: " + numPennies);
    System.out.println("Number of nickels: " + numNickels);
    System.out.println("Number of dimes: " + numDimes);
    System.out.println("Number of quarters: " + numQuarters);
    System.out.println("Number of loonies: " + numLoonies);
    System.out.println("Number of toonies: " + numToonies);
    
    System.out.println("Total number of coins: " + totalNumber());
    System.out.println("Total value of coins: $" + totalValue());
  }
}
```
